package java.com.gildedrose.ItemHandler;

import com.gildedrose.Item;

public class ConjuredItemHandler implements ItemHandler {
    @Override
    public void handleItem(Item item) {
        item.sellIn -= 1;
        if (item.quality >= 2) {
            item.quality -= 2;
        } else {
            item.quality = 0;
        }
        if (item.sellIn < 0 && item.quality >= 2) {
            item.quality -= 2;
        } else if (item.quality > 0) {
            item.quality = 0;
        }
    }
}
