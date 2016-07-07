package ru.serg.trackerActions;

import ru.serg.maket.Item;
import ru.serg.maket.Tracker;
import ru.serg.moduls.BaseAction;
import ru.serg.moduls.Input;

/**@author Serg
 * The class deleted Item
 */
public class DeleteItemAction extends BaseAction{

    /**
     * Constructor DeleteItemAction
     * @param name
     */

    public DeleteItemAction(String name) {
        super(name);
    }

    /**
     * @see super key.
     * @return
     */

    @Override
    public int key() {
        return 4;
    }

    /**
     * @see super execute.
     * @param input
     * @param tracker
     */

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Delete uour item? ");
        for (Item item : tracker.getAll() ) {
            System.out.println(String.format("%s", item.getId()));
        }
        tracker.deleteItem(id);
    }

}

