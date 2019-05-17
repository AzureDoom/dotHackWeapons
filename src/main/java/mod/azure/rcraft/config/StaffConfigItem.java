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

public class StaffConfigItem extends ConfigItem implements IWeighted  {
	
	  public int Weight() {
	    return this.dropWeight;
	  }

	  public transient String registryName = "";

	  public enum creationTypes {
	    NORMAL, RUNED
	  }

	  public String itemType = "Staff";

	  public int dropWeight = 1000;
	  public int normalItemWeight = 80;
	  public int runedItemWeight = 20;

	  public int minRarity = 0;
	  public int maxRarity = 5;

	  public boolean itemIsPlayerLevel = true;

	  public int itemLevelIfDoesntUsePlayerLevel = 1;

	  public int levelVariance = 0;

	  public boolean isValid() throws Exception {

	    boolean matchtype = false;
	    for (GearItemSlot slot : GearTypes.All.values()) {
	      if (slot.GUID().equals(this.itemType)) {
	        matchtype = true;
	      }
	    }
	    if (matchtype == false) {
	      System.out.println("Gear Type doesn't exist");
	      return false;
	    }

	    if (normalItemWeight < 1 && this.runedItemWeight < 1 && this.uniqueItemWeight < 1) {
	      System.out.println("Weights can't all be 0");
	      return false;
	    }

	    return true;

	  }
	  
	  public ItemStack create(ItemStack stack, int level) {

		    level = this.getLevel(level);

		    switch (getCreationType()) {
		      case NORMAL:
		        createNormal(stack, level);
		        break;
		      case RUNED:
		        createRuned(stack, level);
		        break;
		      case UNIQUE:
		          break;

		    }

		    return stack;

		  }

		  private com.robertx22.config.non_mine_items.ConfigItem.creationTypes getCreationType() {

		    WeightedType result = (WeightedType) RandomUtils
		        .WeightedRandom(Arrays.asList(new WeightedType(normalItemWeight, com.robertx22.config.non_mine_items.ConfigItem.creationTypes.NORMAL),
		            new WeightedType(runedItemWeight, com.robertx22.config.non_mine_items.ConfigItem.creationTypes.RUNED)));

		    return result.type;
		  }

	  private int getLevel(int level) {
	    return this.itemIsPlayerLevel ? level : this.itemLevelIfDoesntUsePlayerLevel;
	  }



	  private ItemStack createNormal(ItemStack stack, int level) {

	    GearBlueprint blueprint = new GearBlueprint(level);
	    blueprint.SetSpecificType(this.itemType);
	    blueprint.LevelRange = this.levelVariance > 0;
	    blueprint.LevelVariance = this.levelVariance;
	    blueprint.minRarity = this.minRarity;
	    blueprint.maxRarity = this.maxRarity;

	    GearItemData gear = GearGen.CreateData(blueprint);
	    gear.isNotFromMyMod = true;

	    Gear.Save(stack, gear);

	    return stack;

	  }

	  private ItemStack createRuned(ItemStack stack, int level) {

	    RunedGearBlueprint blueprint = new RunedGearBlueprint(level);
	    blueprint.SetSpecificType(this.itemType);
	    blueprint.LevelRange = this.levelVariance > 0;
	    blueprint.LevelVariance = this.levelVariance;
	    blueprint.minRarity = this.minRarity;
	    blueprint.maxRarity = this.maxRarity;

	    GearItemData gear = RunedGearGen.CreateData(blueprint);
	    gear.isNotFromMyMod = true;

	    Gear.Save(stack, gear);

	    return stack;

	  }

}
