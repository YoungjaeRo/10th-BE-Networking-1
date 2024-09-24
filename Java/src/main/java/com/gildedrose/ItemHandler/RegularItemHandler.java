package java.com.gildedrose.ItemHandler;

import com.gildedrose.Item;

public class RegularItemHandler implements ItemHandler {
    @Override
    public void handleItem(Item item) {
        item.sellIn -= 1;
        if (item.quality > 0) {
            item.quality -= 1;
        }
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 1;
        }
    }
}
