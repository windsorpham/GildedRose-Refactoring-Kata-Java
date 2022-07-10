package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
    	final String output = run(args);
        System.out.println(output);
    }
    
    public static String run(String... args) {
    	final StringBuilder out = new StringBuilder();
    	out.append("OMGHAI!"+"\n");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Backstage passes to other", 5, 49), //added test name
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 30;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]);
        }

        for (int i = 0; i <= days; i++) {
        	out.append("-------- day " + i + " --------\n");
        	out.append("name, sellIn, quality" +"\n");
            for (Item item : items) {
            	out.append(item + "\n");
            }
            out.append("\n");
            app.updateQuality();
        }
        return out.toString();
    }

}
