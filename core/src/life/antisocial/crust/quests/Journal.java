package life.antisocial.crust.quests;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    protected List<Quest> active;
    protected List<Quest> completed;
    protected List<Quest> failed;

    public Journal() {
        active = new ArrayList<Quest>();
        completed = new ArrayList<Quest>();
        failed = new ArrayList<Quest>();
    }

    public void addQuest(Quest _quest) {
        active.add(_quest);
    }

    public void failQuest(Quest _quest) {
        active.remove(getIndexByQuest(_quest));
        failed.add(_quest);
    }

    public void completeQuest(Quest _quest) {
        active.remove(getIndexByQuest(_quest));
        completed.add(_quest);
    }

    private int getIndexByQuest(Quest _quest) {
        return active.indexOf(_quest);
    }

    private Quest getQuestByIndex(int _index) {
        return active.get(_index);
    }

}
