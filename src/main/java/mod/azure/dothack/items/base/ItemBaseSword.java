package mod.azure.dothack.items.base;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.util.DotHackTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class ItemBaseSword extends ItemSword {

    public ItemBaseSword(String name, int damage) {
        super(EnumHelper.addToolMaterial(name, 1, 1561, 4F, damage, 4));
        this.setTranslationKey(name);
        this.setRegistryName(new ResourceLocation(DotHackMod.MODID, name));
        this.setCreativeTab(DotHackTabs.SWORDS);
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return super.getTranslationKey();
    }
}