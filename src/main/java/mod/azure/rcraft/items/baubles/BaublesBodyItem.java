package mod.azure.rcraft.items.baubles;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import mod.azure.rcraft.items.base.ItemBase;
import net.minecraft.item.ItemStack;

public class BaublesBodyItem extends ItemBase implements IBauble {

	public BaublesBodyItem(String name) {
		super(name);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.BODY;
	}

}