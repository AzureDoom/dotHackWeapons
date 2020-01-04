package mod.azure.dothack.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DotHackTabs {

    public static final CreativeTabs SWORDS = (new CreativeTabs("swords") {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(DotHackItems.bladebrandier);
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }).setBackgroundImageName("item_search.png");

    public static final CreativeTabs MAGIC = (new CreativeTabs("magic") {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(DotHackItems.redwand);
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }).setBackgroundImageName("item_search.png");

    public static final CreativeTabs GUNS = (new CreativeTabs("guns") {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(DotHackItems.dualgunner);
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }).setBackgroundImageName("item_search.png");

    public static final CreativeTabs EXTRA = (new CreativeTabs("extra") {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(DotHackItems.datadrain);
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }).setBackgroundImageName("item_search.png");

}