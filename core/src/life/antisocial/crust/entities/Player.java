package life.antisocial.crust.entities;


import life.antisocial.crust.enums.ItemType;
import life.antisocial.crust.items.Inventory;
import life.antisocial.crust.items.Item;
import life.antisocial.crust.quests.Journal;
import life.antisocial.crust.quests.Quest;

public class Player extends Entity {

    protected float speed;
    protected Inventory inventory;
    protected Journal journal;

    public Player(float x, float y) {
        super(x, y);
        speed = 0.5f;
        inventory = new Inventory(12);
        journal = new Journal();

        testStuff();
    }

    private void testStuff() {
        inventory.addItem(new Item("test item", ItemType.WEAPON, "Some kind of test item"));
        journal.addQuest(new Quest("Test quest", "You should do something the quest says", "You got given a quest by some dude."));
    }
}
