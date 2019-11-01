package mod.azure.dothack.proxy;

import net.minecraft.item.Item;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.fml.relauncher.Side;
import static net.minecraftforge.fml.relauncher.Side.SERVER;

import mod.azure.dothack.DotHackMod;

@Mod.EventBusSubscriber(modid = DotHackMod.MODID, value = SERVER)
public class ServerProxy extends IProxy{

	public void preInit() {

	}

	public void init() {

	}

	public void postInit() {

	}
}