package mod.azure.rcraft.proxy;

import java.util.ArrayList;
import java.util.List;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;

import mod.azure.rcraft.RcraftMod;
import mod.azure.rcraft.items.ItemBaseSword;
import mod.azure.rcraft.items.ItemMMOBow;
import mod.azure.rcraft.util.Register;
import mod.azure.rcraft.items.ItemBaseGun;
import mod.azure.rcraft.items.ItemBaseMagic;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {


	public void preInit() {

	}

	public void init() {

	}

	public void postInit() {
	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> e) {
			IForgeRegistry<Item> registry = e.getRegistry();

			for (Item item : Register.itemList) {
				registry.register(item);
			}

			Register.variantList = NonNullList.create();
			for (Item item :  Register.itemList) {
				item.getSubItems(RcraftMod.tab, Register.variantList);
			}
		}
	}
}