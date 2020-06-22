package mod.azure.dothack.item;

import mod.azure.dothack.util.DotHackTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;

public class DothackSword extends SwordItem {

	public DothackSword(int attackDamageIn) {
		super(ItemTier.DIAMOND, attackDamageIn, -2.4F,
				new Item.Properties().group(DotHackTabs.SwordItemGroup).maxStackSize(1));
	}

}