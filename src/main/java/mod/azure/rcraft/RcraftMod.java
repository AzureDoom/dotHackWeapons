package mod.azure.rcraft;

import java.util.ArrayList;
import java.util.List;

import mod.azure.rcraft.proxy.CommonProxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = RcraftMod.modid, version = RcraftMod.version, dependencies = "after:ebwizardry;after:mmorpg;required-after:forge@[14.23.5.2768,)")
public class RcraftMod {

	public static final String modid = "rcraft";
	public static final String MODNAME = "dotHack Weapons";
	public static final String version = "1.5.3";
	
	@SidedProxy(clientSide = "mod.azure.rcraft.proxy.ClientProxy", serverSide = "mod.azure.rcraft.proxy.CommonProxy")
    public static CommonProxy proxy;

	public static CreativeTabs tab = new Tab(modid);

	@Mod.Instance
	public static RcraftMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit();
	}
	
	@Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit();
        if(Loader.isModLoaded("mmorpg")) {
        MineAndSlashAPI.addCompatibleItem("rcraft:harvestcleric", new BasicStaffConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:harvestcleric1", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:harvestcleric2", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:harvestcleric3", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:harvestcleric4", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:harvestcleric5", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:harvestcleric6", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:harvestcleric7", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:harvestcleric8", new MasterStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:macabredancer", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:macabredancer1", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:macabredancer2", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:macabredancer3", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:macabredancer4", new MasterStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock1", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock2", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock3", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock4", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock5", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock6", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock7", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock8", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock9", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock10", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock11", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock12", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock13", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster1", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster2", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster3", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster4", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster5", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster6", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster7", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster8", new BasicStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster9", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster10", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster11", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster12", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster13", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster14", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster15", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster16", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster17", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster18", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster19", new ApprenticeStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster20", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster21", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster22", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster23", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster24", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster25", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster26", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster27", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster28", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster29", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster30", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster31", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster32", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster33", new AdvancedStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster34", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster35", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster36", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster37", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster38", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster39", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster40", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster41", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster42", new NoDropStaffConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster43", new NoDropStaffConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:heavyaxeman", new AxeConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:lordpartizan", new HammerConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:longarm", new HammerConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:edgepunisher", new HammerConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:edgepunisher2", new HammerConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:heavyblade", new HammerConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:flickreaper", new HammerConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:blademaster", new SwordConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:bladebrandier", new SwordConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:dualswords", new SwordConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:dualswords3", new SwordConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:tribalgrappler", new SwordConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:tribalgrappler2", new SwordConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:tribalgrappler3", new SwordConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:tribalgrappler4", new SwordConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:twinblade", new SwordConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:twinblade61", new SwordConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:twinblade71", new SwordConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:twinblade81", new SwordConfigItem());
        MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner", new RareBowConfigItem());
		MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner1", new BowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner2", new BowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner3", new BowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner4", new BowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner5", new BowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner6", new BowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner7", new BowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner8", new BowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner9", new BowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner10", new BowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner11", new BowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner12", new BowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner13", new RareBowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner14", new RareBowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner15", new RareBowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner16", new RareBowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner17", new RareBowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:dualgunner", new NoDropBowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:dualgunner1", new NoDropBowConfigItem());
	    MineAndSlashAPI.addCompatibleItem("rcraft:dualgunner2", new NoDropBowConfigItem());
        }
    } 
}