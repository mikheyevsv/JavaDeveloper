package ru.serg.trackerActions;

import ru.serg.maket.Item;
import ru.serg.maket.Tracker;
import ru.serg.moduls.BaseAction;
import ru.serg.moduls.Input;

/**
 * @author Serg.
 * The class search Item by Id.
 */
public class SearchItemById extends BaseAction {

    /**
     * Constructor SearchItemById.
     * @param name
     */

    public SearchItemById(String name) {
        super(name);
    }

    /**
     * @see super key.
     * @return
     */

    @Override
    public int key() {
        return 3;
    }

    /**
     * @see super execute.
     * @param input
     * @param tracker
     */

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Please enter uour bid's id: ");
        for (Item item : tracker.getAll()) {
            System.out.println(String.format("%s", item.getId()));
        }
        tracker.findById(id);
    }

//        @Override
//        public String info() {
//            return String.format("%s. %s", this.key(), "Search uour item by ID ");
//        }
}
