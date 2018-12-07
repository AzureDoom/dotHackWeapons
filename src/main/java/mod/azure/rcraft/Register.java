package mod.azure.rcraft;
 
import java.util.ArrayList;
import java.util.List;

import electroblob.wizardry.constants.Tier;
import mod.azure.rcraft.items.ItemBaseSword;
import mod.azure.rcraft.items.ItemGun;
import mod.azure.rcraft.items.ItemMagic;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
 
public class Register
{
    public static Item[] itemList;
    public static NonNullList<ItemStack> variantList;  
    static {
        List<Item> items = new ArrayList<Item>();
        items.add(new ItemBaseSword("bladebrandier", 19));
        items.add(new ItemGun("dualgunner", 1));
        items.add(new ItemGun("dualgunner1", 1));
        items.add(new ItemGun("dualgunner2", 1));
        items.add(new ItemBaseSword("dualswords", 24));
        items.add(new ItemBaseSword("dualswords3", 1));
        items.add(new ItemBaseSword("edgepunisher", 19));
        items.add(new ItemBaseSword("edgepunisher2", 1));
        items.add(new ItemBaseSword("flickreaper", 9));
        items.add(new ItemMagic("harvestcleric", 1, Tier.MASTER, null));
        for (int i = 1; i <= 8; i ++)
        {
            items.add(new ItemMagic("harvestcleric" + i, 1, Tier.MASTER, null));
        }
        items.add(new ItemBaseSword("lordpartizan", 9));
        items.add(new ItemMagic("macabredancer", 1, Tier.MASTER, null));
        for (int i = 1; i <= 4; i ++)
        {
            items.add(new ItemMagic("macabredancer" + i, 1, Tier.MASTER, null));
        }
        items.add(new ItemMagic("shadowwarlock", 1, Tier.MASTER, null));
        for (int i = 1; i <= 13; i ++)
        {
            items.add(new ItemMagic("shadowwarlock" + i, 1, Tier.MASTER, null));
        }      
        items.add(new ItemGun("steamgunner", 1));      
        for (int i = 1; i <= 17; i ++)
        {
            items.add(new ItemGun("steamgunner" + i, 1));
        }       
        items.add(new ItemBaseSword("tribalgrappler", 8));
        for (int i = 2; i <= 4; i ++)
        {
            items.add(new ItemBaseSword("tribalgrappler" + i, 1));
        } 
        items.add(new ItemBaseSword("blademaster", 41));
        items.add(new ItemBaseSword("heavyaxeman", 45));
        items.add(new ItemBaseSword("heavyblade", 38));
        items.add(new ItemBaseSword("longarm", 42));
        items.add(new ItemBaseSword("twinblade", 38));
        items.add(new ItemBaseSword("twinblade61", 10));
        items.add(new ItemBaseSword("twinblade71", 1));
        items.add(new ItemBaseSword("twinblade81", 30));
        items.add(new ItemMagic("wavemaster", 1, Tier.MASTER, null));
        for (int i = 1; i <= 43; i ++)
        {
            items.add(new ItemMagic("wavemaster" + i, 1, Tier.MASTER, null));
        }  
        itemList = items.toArray(new Item[items.size()]);
    }
}