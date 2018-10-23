package mod.azure.rcraft;

import electroblob.wizardry.constants.Tier;
import mod.azure.rcraft.items.ItemGun;
import mod.azure.rcraft.items.ItemMagic;
import mod.azure.rcraft.items.ItemSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class Register {

	public static final Item bladeBrandierItem =  new ItemSword("bladebrandier", 19);
	public static final Item dualGunnerItem =  new ItemSword("dualgunner", 3);
	public static final Item dualSwordsItem =  new ItemSword("dualswords", 25);
	public static final Item edgePunisherItem =  new ItemSword("edgepunisher", 20);
	public static final Item flickReaperItem =  new ItemSword("flickreaper", 9);
	public static final Item harvestClericItem =  new ItemMagic("harvestcleric", 1, Tier.MASTER, null);
	public static final Item harvestCleric1Item =  new ItemMagic("harvestcleric1", 1, Tier.MASTER, null);
	public static final Item harvestCleric2Item =  new ItemMagic("harvestcleric2", 1, Tier.MASTER, null);
	public static final Item harvestCleric3Item =  new ItemMagic("harvestcleric3", 1, Tier.MASTER, null);
	public static final Item harvestCleric4Item =  new ItemMagic("harvestcleric4", 1, Tier.MASTER, null);
	public static final Item harvestCleric5Item =  new ItemMagic("harvestcleric5", 1, Tier.MASTER, null);
	public static final Item harvestCleric6Item =  new ItemMagic("harvestcleric6", 1, Tier.MASTER, null);
	public static final Item harvestCleric7Item =  new ItemMagic("harvestcleric7", 1, Tier.MASTER, null);
	public static final Item harvestCleric8Item =  new ItemMagic("harvestcleric8", 1, Tier.MASTER, null);
	public static final Item lordPartizanItem =  new ItemSword("lordpartizan", 9);
	public static final Item macabreDancerItem =  new ItemSword("macabredancer", 5);
	public static final Item shadowWarlockItem =  new ItemMagic("shadowwarlock", 1, Tier.MASTER, null);
	public static final Item shadowWarlock1Item =  new ItemMagic("shadowwarlock1", 1, Tier.MASTER, null);
	public static final Item shadowWarlock2Item =  new ItemMagic("shadowwarlock2", 1, Tier.MASTER, null);
	public static final Item shadowWarlock3Item =  new ItemMagic("shadowwarlock3", 1, Tier.MASTER, null);
	public static final Item shadowWarlock4Item =  new ItemMagic("shadowwarlock4", 1, Tier.MASTER, null);
	public static final Item shadowWarlock5Item =  new ItemMagic("shadowwarlock5", 1, Tier.MASTER, null);
	public static final Item shadowWarlock6Item =  new ItemMagic("shadowwarlock6", 1, Tier.MASTER, null);
	public static final Item shadowWarlock7Item =  new ItemMagic("shadowwarlock7", 1, Tier.MASTER, null);
	public static final Item shadowWarlock8Item =  new ItemMagic("shadowwarlock8", 1, Tier.MASTER, null);
	public static final Item shadowWarlock9Item =  new ItemMagic("shadowwarlock9", 1, Tier.MASTER, null);
	public static final Item shadowWarlock10Item =  new ItemMagic("shadowwarlock10", 1, Tier.MASTER, null);
	public static final Item shadowWarlock11Item =  new ItemMagic("shadowwarlock11", 1, Tier.MASTER, null);
	public static final Item shadowWarlock12Item =  new ItemMagic("shadowwarlock12", 1, Tier.MASTER, null);
	public static final Item shadowWarlock13Item =  new ItemMagic("shadowwarlock13", 1, Tier.MASTER, null);
	public static final Item steamGunnerItem =  new ItemSword("steamgunner", 19);
	public static final Item tribalGrapplerItem =  new ItemSword("tribalgrappler", 11);
	//public static final Item bladeMasterItem =  new ItemSword("blademaster", 41);
	//public static final Item heavyAxemanItem =  new ItemSword("heavyaxeman", 49);
	//public static final Item heavyBladeItem =  new ItemSword("heavyblade", 46);
	//public static final Item longArmItem =  new ItemSword("longarm", 46);
	//public static final Item twinBladeItem =  new ItemSword("twinblade", 122);
	//public static final Item waveMasterItem =  new ItemMagic("wavemaster", 46);
	
	public static final Item[] itemList = new Item[] {
			bladeBrandierItem, dualSwordsItem, edgePunisherItem,
			flickReaperItem, macabreDancerItem, steamGunnerItem,
			harvestClericItem, harvestCleric1Item, harvestCleric2Item, 
			harvestCleric3Item, harvestCleric4Item, harvestCleric5Item, harvestCleric6Item, 
			harvestCleric7Item, harvestCleric8Item, 
			shadowWarlockItem, shadowWarlock1Item, shadowWarlock2Item, shadowWarlock3Item, 
			shadowWarlock4Item, shadowWarlock5Item, shadowWarlock6Item, shadowWarlock7Item, 
			shadowWarlock8Item, shadowWarlock9Item, shadowWarlock10Item, shadowWarlock11Item, 
			shadowWarlock12Item, shadowWarlock13Item, 
			lordPartizanItem, tribalGrapplerItem, dualGunnerItem/*,
			bladeMasterItem,  heavyAxemanItem, heavyBladeItem, longArmItem, twinBladeItem, waveMasterItem*/
	};

	public static NonNullList<ItemStack> variantList;
}
