package mod.azure.rcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import mod.azure.rcraft.CommonProxy;

@Mod(modid = RcraftMod.modid, version = RcraftMod.version, dependencies = "required-after:ebwizardry;required-after:forge@[14.23.4.2705,)")
public class RcraftMod {

	public static final String modid = "rcraft";
	public static final String version = "1.2.0";
	
	@SidedProxy(clientSide = "mod.azure.rcraft.ClientProxy", serverSide = "mod.azure.rcraft.CommonProxy")
    public static CommonProxy proxy;

	public static CreativeTabs tab = new Tab(modid);

	@Instance(modid)
	public static RcraftMod instance;

	@SideOnly(Side.CLIENT)
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
	}
}
