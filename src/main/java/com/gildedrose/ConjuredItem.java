package com.gildedrose;

public class ConjuredItem extends NormalItem implements IItem{

	public ConjuredItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		sellIn = sellIn -1;
		if(quality > 0)
			quality = quality - 1;
		if(quality > 0)
			quality = quality - 1;	
	}


}
