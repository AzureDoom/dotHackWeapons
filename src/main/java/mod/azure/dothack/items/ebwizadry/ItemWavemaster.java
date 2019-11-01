package mod.azure.dothack.items.ebwizadry;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import mod.azure.dothack.registry.DotHackTabs;

public class ItemWavemaster extends ItemEBWand {

	public ItemWavemaster(Tier tier, Element element) {
		super(tier, element);
		this.setCreativeTab(DotHackTabs.tabwm);
	}

}
