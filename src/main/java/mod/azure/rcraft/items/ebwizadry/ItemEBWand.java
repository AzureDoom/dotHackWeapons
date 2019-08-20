package mod.azure.rcraft.items.ebwizadry;

import electroblob.wizardry.Wizardry;
import electroblob.wizardry.constants.Constants;
import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import electroblob.wizardry.item.IManaStoringItem;
import electroblob.wizardry.item.IWorkbenchItem;
import electroblob.wizardry.item.ItemWand;
import electroblob.wizardry.registry.Spells;
import electroblob.wizardry.registry.WizardryAdvancementTriggers;
import electroblob.wizardry.registry.WizardryItems;
import electroblob.wizardry.spell.Spell;
import electroblob.wizardry.util.SpellProperties;
import electroblob.wizardry.util.WandHelper;
import mod.azure.rcraft.RcraftMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemEBWand extends ItemWand {

	public ItemEBWand(String name, Tier tier, Element element) {
		super(tier, element);
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(RcraftMod.modid, name));
		this.setCreativeTab(RcraftMod.tab);
		this.tier = tier;
		this.element = element;
		
	}
	
	public String getTranslationKey(ItemStack stack) {
		return this.getTranslationKey();
	}
	
	@Override
	public boolean onApplyButtonPressed(EntityPlayer player, Slot centre, Slot crystals, Slot upgrade, Slot[] spellBooks){
		
		boolean changed = false;
		
		// Upgrades wand if necessary. Damage is copied, preserving remaining durability,
		// and also the entire NBT tag compound.
		if(upgrade.getStack().getItem() == WizardryItems.arcane_tome){

			Tier tier = Tier.values()[upgrade.getStack().getItemDamage()];

			// Checks the wand upgrade is for the tier above the wand's tier, and that either the wand has enough
			// progression or the player is in creative mode.
			// It is guaranteed that: this == centre.getStack().getItem()
			if((player.isCreative() || Wizardry.settings.legacyWandLevelling
					|| WandHelper.getProgression(centre.getStack()) >= tier.progression)
					&& tier.ordinal() - 1 == this.tier.ordinal()){

				upgrade.decrStackSize(1);
				
				changed = true;
			}

		}else if(WandHelper.isWandUpgrade(upgrade.getStack().getItem())){

			// Special upgrades
			Item specialUpgrade = upgrade.getStack().getItem();

			if(WandHelper.getTotalUpgrades(centre.getStack()) < this.tier.upgradeLimit
					&& WandHelper.getUpgradeLevel(centre.getStack(), specialUpgrade) < Constants.UPGRADE_STACK_LIMIT){

				// Used to preserve existing mana when upgrading storage rather than creating free mana.
				int prevMana = this.getMana(centre.getStack());

				WandHelper.applyUpgrade(centre.getStack(), specialUpgrade);

				// Special behaviours for specific upgrades
				if(specialUpgrade == WizardryItems.storage_upgrade){

					this.setMana(centre.getStack(), prevMana);
					
				}else if(specialUpgrade == WizardryItems.attunement_upgrade){

					int newSlotCount = BASE_SPELL_SLOTS + WandHelper.getUpgradeLevel(centre.getStack(),
							WizardryItems.attunement_upgrade);
					
					Spell[] spells = WandHelper.getSpells(centre.getStack());
					Spell[] newSpells = new Spell[newSlotCount];

					for(int i = 0; i < newSpells.length; i++){
						newSpells[i] = i < spells.length && spells[i] != null ? spells[i] : Spells.none;
					}

					WandHelper.setSpells(centre.getStack(), newSpells);

					int[] cooldowns = WandHelper.getCooldowns(centre.getStack());
					int[] newCooldowns = new int[newSlotCount];

					if(cooldowns.length > 0){
						System.arraycopy(cooldowns, 0, newCooldowns, 0, cooldowns.length);
					}

					WandHelper.setCooldowns(centre.getStack(), newCooldowns);
				}

				upgrade.decrStackSize(1);
				WizardryAdvancementTriggers.special_upgrade.triggerFor(player);

				if(WandHelper.getTotalUpgrades(centre.getStack()) == Tier.MASTER.upgradeLimit){
					WizardryAdvancementTriggers.max_out_wand.triggerFor(player);
				}
				
				changed = true;
			}
		}

		// Reads NBT spell metadata array to variable, edits this, then writes it back to NBT.
		// Original spells are preserved; if a slot is left empty the existing spell binding will remain.
		// Accounts for spells which cannot be applied because they are above the wand's tier; these spells
		// will not bind but the existing spell in that slot will remain and other applicable spells will
		// be bound as normal, along with any upgrades and crystals.
		Spell[] spells = WandHelper.getSpells(centre.getStack());
		
		if(spells.length <= 0){
			// Base value here because if the spell array doesn't exist, the wand can't possibly have attunement upgrades
			spells = new Spell[BASE_SPELL_SLOTS];
		}
		
		for(int i = 0; i < spells.length; i++){
			if(spellBooks[i].getStack() != ItemStack.EMPTY){
				
				Spell spell = Spell.byMetadata(spellBooks[i].getStack().getItemDamage());
				// If the wand is powerful enough for the spell, it's not already bound to that slot and it's enabled for wands
				if(!(spell.getTier().level > this.tier.level) && spells[i] != spell && spell.isEnabled(SpellProperties.Context.WANDS)){
					spells[i] = spell;
					changed = true;
				}
			}
		}
		
		WandHelper.setSpells(centre.getStack(), spells);

		// Charges wand by appropriate amount
		if(crystals.getStack() != ItemStack.EMPTY && !this.isManaFull(centre.getStack())){
			
			int chargeDepleted = this.getManaCapacity(centre.getStack()) - this.getMana(centre.getStack());

			int manaPerItem = Constants.MANA_PER_CRYSTAL;
			if(crystals.getStack().getItem() == WizardryItems.crystal_shard) manaPerItem = Constants.MANA_PER_SHARD;
			if(crystals.getStack().getItem() == WizardryItems.grand_crystal) manaPerItem = Constants.GRAND_CRYSTAL_MANA;
			
			if(crystals.getStack().getCount() * manaPerItem < chargeDepleted){
				// If there aren't enough crystals to fully charge the wand
				this.rechargeMana(centre.getStack(), crystals.getStack().getCount() * manaPerItem);
				crystals.decrStackSize(crystals.getStack().getCount());

			}else{
				// If there are excess crystals (or just enough)
				this.setMana(centre.getStack(), this.getManaCapacity(centre.getStack()));
				crystals.decrStackSize((int)Math.ceil(((double)chargeDepleted) / manaPerItem));
			}

			changed = true;
		}
		
		return changed;
	}
}