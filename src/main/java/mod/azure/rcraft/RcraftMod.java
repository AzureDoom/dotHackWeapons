package mod.azure.rcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = RcraftMod.modid, version = RcraftMod.version)
public class RcraftMod extends ModelLoaderRegistry {

	public static final String modid = "rcraft";
	public static final String version = "0.7";

	public static CreativeTabs tab = new Tab(modid);

	@Instance(modid)
	public static RcraftMod instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) OBJLoader.INSTANCE.addDomain(RcraftMod.modid);
	}
}
