package mod.azure.rcraft.config;

import com.robertx22.config.non_mine_items.ConfigItem;

public class BowConfigItem extends ConfigItem  {

	public BowConfigItem() {
	  this.itemType = "Bow";
	  this.dropWeight = 1000;
	  this.normalItemWeight = 80;
	  this.runedItemWeight = 20;
	  this.minRarity = 0;
	  this.maxRarity = 5;
	  this.itemIsPlayerLevel = true;
	}

}
