package life.antisocial.crust.items;

import life.antisocial.crust.core.Stats;
import life.antisocial.crust.enums.ItemType;

public class Item {

    protected ItemType type;
    protected String name;
    protected String description;
    protected String journalEntry;
    protected Stats stats;

    public Item(String _name, ItemType _type, String _description) {
        name = _name;
        type = _type;
        description = _description;
    }

    public Item(String _name, ItemType _type, String _description, String _journalEntry) {
        name = _name;
        type = _type;
        description = _description;
        journalEntry = _journalEntry;
    }

    public Item(String _name, ItemType _type, String _description, Stats _stats) {
        name = _name;
        type = _type;
        description = _description;
        stats = _stats;
    }

    public Item(String _name, ItemType _type, String _description, String _journalEntry, Stats _stats) {
        name = _name;
        type = _type;
        description = _description;
        journalEntry = _journalEntry;
        stats = _stats;
    }
}
