package mod.azure.rcraft;

import mod.azure.rcraft.proxy.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Tab extends CreativeTabs {

	private int nextTicks;

	private ItemStack stack;
	private int index;

	public Tab(String label) {
		super(label);
	}

	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel() {
		return "tab." + RcraftMod.modid;
	}

	@Override
	public ItemStack getIconItemStack() {
		int ticks = Minecraft.getMinecraft().ingameGUI.getUpdateCounter();
		if (ticks >= this.nextTicks) {
			this.nextTicks = ticks + 8;
			if (++this.index >= CommonProxy.variantList.size()) this.index = 0;
			
			this.stack = CommonProxy.variantList.get(this.index);
		}
		
		return this.getTabIconItem();
	}

	@Override
	public ItemStack getTabIconItem() {
		return this.stack;
	}
}
