package life.antisocial.crust.quests;

public class JournalEntry {

    protected String date;
    protected String entry;

    public JournalEntry(String _date, String _entry) {
        date = _date;
        entry = _entry;
    }

    public String getDat() {
        return date;
    }

    public String getEntry() {
        return entry;
    }

}
