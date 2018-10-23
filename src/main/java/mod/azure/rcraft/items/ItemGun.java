package mod.azure.rcraft.items;

import mod.azure.rcraft.IMultiType;
import mod.azure.rcraft.RcraftMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemGun extends ItemBow implements IMultiType {
	
	private final int maxTypes;

	public ItemGun(String name, int maxTypes) {
		this.maxTypes = maxTypes;
		
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(RcraftMod.modid, name));
		this.setCreativeTab(RcraftMod.tab);
		
		this.setHasSubtypes(true);
	}

	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.BOW;
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		return true;
	}

	@Override
	public void onPlayerStoppedUsing(ItemStack stack, World world, EntityLivingBase entity, int timeLeft) {
		if (entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			
			if (!world.isRemote) {
		        EntityTippedArrow entityarrow = new EntityTippedArrow(world, player);
		        entityarrow.shoot(player, player.rotationPitch, player.rotationYaw, 0.0f, 3.0f, 1.0f);
				entityarrow.setIsCritical(true);
				
				int powerLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, stack);
				if (powerLevel > 0) entityarrow.setDamage(entityarrow.getDamage() + (double)powerLevel * 0.5D + 0.5D);
				
				int punchLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, stack);
				if (punchLevel > 0) entityarrow.setKnockbackStrength(punchLevel);
				
				int flameLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, stack);
				if (flameLevel > 0) entityarrow.setFire(100);

				world.spawnEntity(entityarrow);
			}
			
			world.playSound(null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0f, 1.0f / (itemRand.nextFloat() * 0.4f + 1.2f) + 0.5f);
			player.addStat(StatList.getObjectUseStats(this));
		}
	}

	public int getMaxTypes() {
		return this.maxTypes;
	}

	public int getType(ItemStack stack) {
		return stack.getItemDamage() + 1;
	}

	@Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> variants) {
		if (this.isInCreativeTab(tab)) {
			for (int meta = 0; meta < this.getMaxTypes(); meta++) {
				variants.add(new ItemStack(this, 1, meta));
			}
		}
	}

	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + this.getType(stack);
	}
}
