package mod.azure.dothack.item;

import mod.azure.dothack.entity.projectiles.BulletEntity;
import mod.azure.dothack.util.DotHackTabs;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;

public class BulletAmmo extends ArrowItem {

	public final float damage;
	private RegistryObject<Item> ref;

	public BulletAmmo(float damageIn) {
		super(new Item.Properties().group(DotHackTabs.GunsItemGroup));
		this.damage = damageIn;
	}

	@Override
	public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.PlayerEntity player) {
		int enchant = net.minecraft.enchantment.EnchantmentHelper
				.getEnchantmentLevel(net.minecraft.enchantment.Enchantments.INFINITY, bow);
		return enchant <= 0 ? false : this instanceof BulletAmmo;
	}

	public BulletAmmo setItemReference(RegistryObject<Item> refIn) {
		this.ref = refIn;
		return this;
	}

	@Override
	public BulletEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
		BulletEntity arrowentity = new BulletEntity(shooter, worldIn, ref.get());
		arrowentity.setDamage(this.damage);
		return arrowentity;
	}

}