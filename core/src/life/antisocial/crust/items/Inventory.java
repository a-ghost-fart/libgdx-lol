package life.antisocial.crust.items;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    protected List<Item> itemList;
    protected int size;

    public Inventory(int _size) {
        size = _size;
        itemList = new ArrayList<Item>();
    }

    public void addItem(Item _item) {
        itemList.add(_item);
    }

    public Item dropItem(Item _item) {
        Item item = getItemByIndex(getIndexByItem(_item));
        destroyItem(item);
        return item;
    }

    public void destroyItem(Item _item){
        itemList.remove(getIndexByItem(_item));
    }

    public List<Item> getItemList() {
        return itemList;
    }

    private int getIndexByItem(Item _item) {
        return itemList.indexOf(_item);
    }

    private Item getItemByIndex(int _index) {
        return itemList.get(_index);
    }
}
