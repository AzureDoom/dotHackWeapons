package mod.azure.rcraft;

import mod.azure.rcraft.proxy.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(Side.CLIENT)
public class Tab extends CreativeTabs {

	private int nextTicks;

	private ItemStack stack;
	private int index;

	public Tab(String label) {
		super(label);
	}

	public String getTranslatedTabLabel() {
		return "tab." + RcraftMod.modid;
	}
	
	@Override
	public ItemStack getIcon() {
		int ticks = Minecraft.getMinecraft().ingameGUI.getUpdateCounter();
		if (ticks >= this.nextTicks) {
			this.nextTicks = ticks + 8;
			if (++this.index >= CommonProxy.variantList.size()) this.index = 0;
			
			this.stack = CommonProxy.variantList.get(this.index);
		}
		
		return this.createIcon();
	}

	@Override
	public ItemStack createIcon() {
		return this.stack;
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

}
