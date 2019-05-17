package mod.azure.rcraft.config;

import com.robertx22.config.non_mine_items.ConfigItem;

public class SwordConfigItem extends ConfigItem  {

	public SwordConfigItem() {
	  this.itemType = "Sword";
	  this.dropWeight = 1000;
	  this.normalItemWeight = 80;
	  this.runedItemWeight = 20;
	  this.minRarity = 0;
	  this.maxRarity = 5;
	  this.itemIsPlayerLevel = true;
	}

}
