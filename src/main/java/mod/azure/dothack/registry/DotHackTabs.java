package mod.azure.dothack.registry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.items.mineandslash.ItemMSStaff;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DotHackTabs extends CreativeTabs {
	
	public DotHackTabs(String name) {
        super(DotHackMod.MODID + "." + name);
    }
	
	@Override
	public ItemStack createIcon() {
		return new ItemStack(DotHackItems.redwand);
	}
 
}