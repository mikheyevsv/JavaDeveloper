package ru.serg.trackerActions;

import ru.serg.maket.Item;
import ru.serg.maket.Tracker;
import ru.serg.moduls.BaseAction;
import ru.serg.moduls.Input;

/**
 * @author Serg.
 * The class show Item.
 */
public class ShowItemAction extends BaseAction{

    /**
     * Constructor ShowItemAction.
     * @param name
     */

    public ShowItemAction(String name) {
        super(name);
    }

    /**
     * @see super key.
     * @return
     */

    @Override
    public int key() {
        return 1;
    }

    /**
     * @see super execute.
     * @param input
     * @param tracker
     */

    @Override
    public void execute(Input input, Tracker tracker) {
        for (Item item : tracker.getAll()) {
            System.out.println(String.format("%s, %s, %s", item.getName(), item.getId(), item.getDeskription()));
        }
    }

}
