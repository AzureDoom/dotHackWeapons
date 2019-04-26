package mod.azure.rcraft.items;

import java.util.HashMap;

import com.robertx22.customitems.gearitems.bases.IGearItem;
import com.robertx22.customitems.gearitems.bases.IWeapon;
import com.robertx22.customitems.gearitems.bases.WeaponMechanic;
import com.robertx22.customitems.gearitems.weapon_mechanics.SwordWeaponMechanic;

import mod.azure.rcraft.IMultiType;
import mod.azure.rcraft.RcraftMod;
import mod.azure.rcraft.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ItemBaseSword extends ItemSword implements IMultiType, IGearItem, IWeapon {
	private final int maxTypes;
	public static HashMap<Integer, Item> Items = new HashMap<Integer, Item>();

	public ItemBaseSword(String name, int maxTypes) {
		super(EnumHelper.addToolMaterial(name, 1, 0, 4F, (4*2), 4));
		this.maxTypes = maxTypes;
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(RcraftMod.modid, name));
		this.setCreativeTab(RcraftMod.tab);
		this.setHasSubtypes(true);
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

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey() + this.getType(stack);
	}

	@Override
    public WeaponMechanic mechanic() {
	return new SwordWeaponMechanic();
    }
	
}