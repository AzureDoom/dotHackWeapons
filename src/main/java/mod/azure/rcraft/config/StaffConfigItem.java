package mod.azure.rcraft.config;

import java.util.Arrays;

import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.config.non_mine_items.WeightedType;
import com.robertx22.database.gearitemslots.bases.GearItemSlot;
import com.robertx22.db_lists.GearTypes;
import com.robertx22.generation.GearGen;
import com.robertx22.generation.RunedGearGen;
import com.robertx22.generation.UniqueGearGen;
import com.robertx22.generation.blueprints.GearBlueprint;
import com.robertx22.generation.blueprints.RunedGearBlueprint;
import com.robertx22.generation.blueprints.UniqueBlueprint;
import com.robertx22.items.unique_items.IUnique;
import com.robertx22.saveclasses.GearItemData;
import com.robertx22.uncommon.datasaving.Gear;
import com.robertx22.uncommon.utilityclasses.IWeighted;
import com.robertx22.uncommon.utilityclasses.RandomUtils;

import net.minecraft.item.ItemStack;

public class StaffConfigItem extends ConfigItem  {
	
	  public int Weight() {
	    return this.dropWeight;
	  }

	  public transient String registryName = "";

	  public String itemType = "Staff";

	  public int dropWeight = 1000;
	  public int normalItemWeight = 80;
	  public int runedItemWeight = 20;

	  public int minRarity = 0;
	  public int maxRarity = 5;

	  public boolean itemIsPlayerLevel = true;

	  public int itemLevelIfDoesntUsePlayerLevel = 1;

}
