package mod.azure.rcraft.config;

import com.robertx22.config.non_mine_items.ConfigItem;

import net.minecraft.item.ItemStack;

public class AxeConfigItem extends ConfigItem  {

	public AxeConfigItem() {
	  this.itemType = "Axe";
	  this.dropWeight = 1000;
	  this.normalItemWeight = 80;
	  this.runedItemWeight = 20;
	  this.minRarity = 0;
	  this.maxRarity = 5;
	  this.itemIsPlayerLevel = true;
	}

}
