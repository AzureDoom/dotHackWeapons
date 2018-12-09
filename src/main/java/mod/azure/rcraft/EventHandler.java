package mod.azure.rcraft;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = RcraftMod.modid)
public class EventHandler {
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		
		for (Item item : Register.itemList) {
			registry.register(item);
		}
		
		Register.variantList = NonNullList.create();
		for (Item item : Register.itemList) {
			item.getSubItems(RcraftMod.tab, Register.variantList);
		}
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		for (ItemStack variant : Register.variantList) {
			Item item = variant.getItem();
			ModelLoader.setCustomModelResourceLocation(item, variant.getItemDamage(), new ModelResourceLocation(item.getRegistryName(), String.format("type=%d", ((IMultiType) item).getType(variant))));
		}
	}
}