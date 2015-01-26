package life.antisocial.crust.quests;

public class Quest {

    protected String name;
    protected String description;
    protected String journalEntry;

    public Quest(String _name, String _description, String _journalEntry) {
        name = _name;
        description = _description;
        journalEntry = _journalEntry;
    }

}
