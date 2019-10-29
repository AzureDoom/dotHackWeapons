package mod.azure.dothack.items.ebwizadry;

import java.util.Random;

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
import electroblob.wizardry.registry.WizardrySounds;
import electroblob.wizardry.spell.Spell;
import electroblob.wizardry.util.ParticleBuilder;
import electroblob.wizardry.util.SpellProperties;
import electroblob.wizardry.util.WandHelper;
import electroblob.wizardry.util.ParticleBuilder.Type;
import mod.azure.dothack.DotHackItems;
import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.DotHackTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

public class ItemEBWand extends ItemWand {

	private static Integer number = 0;

	public ItemEBWand(Integer number, Tier tier, Element element) {
		super(tier, element);
		this.setCreativeTab(DotHackMod.tab);
		this.tier = tier;
		this.element = element;
		this.number = number;

	}

	@SubscribeEvent
	public boolean onApplyButtonPressed(EntityPlayer player, Slot centre, Slot crystals, Slot upgrade, Slot[] spellBooks){
		
		boolean changed = false;
		if(upgrade.getStack().getItem() == WizardryItems.arcane_tome){

			Tier tier = Tier.values()[upgrade.getStack().getItemDamage()];
			if((player.isCreative() || Wizardry.settings.legacyWandLevelling
					|| WandHelper.getProgression(centre.getStack()) >= tier.progression)
					&& tier.ordinal() - 1 == this.tier.ordinal()){
				WandHelper.setProgression(centre.getStack(), 0);
				ItemStack newWand = new ItemStack(DotHackItems.getWand(number, tier, this.element));
				newWand.setTagCompound(centre.getStack().getTagCompound());
				((IManaStoringItem)newWand.getItem()).setMana(newWand, this.getMana(centre.getStack()));
				centre.putStack(newWand);
				upgrade.decrStackSize(1);				
				changed = true;
			}
		}else if(WandHelper.isWandUpgrade(upgrade.getStack().getItem())){
			Item specialUpgrade = upgrade.getStack().getItem();
			if(WandHelper.getTotalUpgrades(centre.getStack()) < this.tier.upgradeLimit
					&& WandHelper.getUpgradeLevel(centre.getStack(), specialUpgrade) < Constants.UPGRADE_STACK_LIMIT){
				int prevMana = this.getMana(centre.getStack());
				WandHelper.applyUpgrade(centre.getStack(), specialUpgrade);
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
		Spell[] spells = WandHelper.getSpells(centre.getStack());
		if(spells.length <= 0){
			spells = new Spell[BASE_SPELL_SLOTS];
		}
		
		for(int i = 0; i < spells.length; i++){
			if(spellBooks[i].getStack() != ItemStack.EMPTY){
				Spell spell = Spell.byMetadata(spellBooks[i].getStack().getItemDamage());
				if(!(spell.getTier().level > this.tier.level) && spells[i] != spell && spell.isEnabled(SpellProperties.Context.WANDS)){
					spells[i] = spell;
					changed = true;
				}
			}
		}
		
		WandHelper.setSpells(centre.getStack(), spells);
		if(crystals.getStack() != ItemStack.EMPTY && !this.isManaFull(centre.getStack())){
			int chargeDepleted = this.getManaCapacity(centre.getStack()) - this.getMana(centre.getStack());
			int manaPerItem = Constants.MANA_PER_CRYSTAL;
			if(crystals.getStack().getItem() == WizardryItems.crystal_shard) manaPerItem = Constants.MANA_PER_SHARD;
			if(crystals.getStack().getItem() == WizardryItems.grand_crystal) manaPerItem = Constants.GRAND_CRYSTAL_MANA;
			if(crystals.getStack().getCount() * manaPerItem < chargeDepleted){
				this.rechargeMana(centre.getStack(), crystals.getStack().getCount() * manaPerItem);
				crystals.decrStackSize(crystals.getStack().getCount());
			}else{
				this.setMana(centre.getStack(), this.getManaCapacity(centre.getStack()));
				crystals.decrStackSize((int)Math.ceil(((double)chargeDepleted) / manaPerItem));
			}
			changed = true;
		}
		
		return changed;
	}
	
	@SubscribeEvent
	public static void onAttackEntityEvent(AttackEntityEvent event){

		EntityPlayer player = event.getEntityPlayer();
		ItemStack stack = player.getHeldItemMainhand(); // Can't melee with offhand items

		if(stack.getItem() instanceof IManaStoringItem){

			// Nobody said it had to be a wand, as long as it's got a melee upgrade it counts
			int level = WandHelper.getUpgradeLevel(stack, WizardryItems.melee_upgrade);
			int mana = ((IManaStoringItem)stack.getItem()).getMana(stack);

			if(level > 0 && mana > 0){

				Random random = player.world.rand;

				player.world.playSound(player.posX, player.posY, player.posZ, WizardrySounds.ITEM_WAND_MELEE, SoundCategory.PLAYERS, 0.75f, 1, false);

				if(player.world.isRemote){

					Vec3d origin = new Vec3d(player.posX, player.getEntityBoundingBox().minY + player.getEyeHeight(), player.posZ);
					Vec3d hit = origin.add(player.getLookVec().scale(player.getDistance(event.getTarget())));
					// Generate two perpendicular vectors in the plane perpendicular to the look vec
					Vec3d vec1 = player.getLookVec().rotatePitch(90);
					Vec3d vec2 = player.getLookVec().crossProduct(vec1);

					for(int i = 0; i < 15; i++){
						ParticleBuilder.create(Type.SPARKLE).pos(hit)
								.vel(vec1.scale(random.nextFloat() * 0.3f - 0.15f).add(vec2.scale(random.nextFloat() * 0.3f - 0.15f)))
								.clr(1f, 1f, 1f).fade(0.3f, 0.5f, 1)
								.time(8 + random.nextInt(4)).spawn(player.world);
					}
				}
			}
		}
	}
}