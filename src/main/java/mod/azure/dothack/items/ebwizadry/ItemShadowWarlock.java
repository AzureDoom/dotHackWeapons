package mod.azure.dothack.items.ebwizadry;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import mod.azure.dothack.tabs.DotHackTabs;

public class ItemShadowWarlock extends ItemEBWand {

	public ItemShadowWarlock(Integer number, Tier tier, Element element) {
		super(number, tier, element);
		this.setCreativeTab(DotHackTabs.tabsw);
	}

}
