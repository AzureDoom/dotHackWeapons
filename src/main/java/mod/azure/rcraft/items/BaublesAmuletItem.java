package mod.azure.rcraft.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.item.ItemStack;

public class BaublesAmuletItem extends ItemBase implements IBauble {

	public BaublesAmuletItem(String name) {
		super(name);
	}

	@Override
    public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.AMULET;
    }

}