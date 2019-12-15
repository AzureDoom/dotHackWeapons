package mod.azure.dothack.items.base;

import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemBaseSword extends ItemSword {

	public ItemBaseSword(String name, int damage) {
		super(EnumHelper.addToolMaterial(name, 1, 1561, 4F, damage, 4));
	}
}