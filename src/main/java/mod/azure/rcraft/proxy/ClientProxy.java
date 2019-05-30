package mod.azure.rcraft.proxy;

import mod.azure.rcraft.RcraftMod;
import mod.azure.rcraft.util.Register;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	@EventHandler
	public void preInit()
    {
		OBJLoader.INSTANCE.addDomain(RcraftMod.modid);
    }
	
	@EventHandler
	public void init() {
		
	}
	
	@EventHandler
	public void postInit() {
		
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		for (Item item : Register.itemList) {
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}
}
