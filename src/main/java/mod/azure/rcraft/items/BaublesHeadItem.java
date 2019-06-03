package mod.azure.rcraft.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.item.ItemStack;

public class BaublesHeadItem extends ItemBase implements IBauble {

	public BaublesHeadItem(String name) {
		super(name);
	}

	@Override
    public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.HEAD;
    }

}