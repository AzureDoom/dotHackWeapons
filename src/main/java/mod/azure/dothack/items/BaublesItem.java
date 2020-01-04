package mod.azure.dothack.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.util.DotHackTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class BaublesItem extends Item implements IBauble {

    public BaubleType type;

    public BaublesItem(String name, BaubleType type) {
        super();
        this.type = type;
        this.setTranslationKey(name);
        this.setRegistryName(new ResourceLocation(DotHackMod.MODID, name));
        this.setCreativeTab(DotHackTabs.EXTRA);
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return this.type;
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return super.getTranslationKey();
    }

}