package ru.serg.trackerActions;

import ru.serg.maket.Item;
import ru.serg.maket.Tracker;
import ru.serg.moduls.BaseAction;
import ru.serg.moduls.Input;

/**
 * @author Serg
 * Add application.
 */
public class AddItemAction extends BaseAction {

    /**
     * Constructor
     * @param name
     */

    public AddItemAction(String name) {
        super(name);
    }

    /**
     * @see super key.
     * @return
     */
    @Override
    public int key() {
        return 0;
    }

    /**
     * @see super execute.
     * @param input
     * @param tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.ask("Please enter the bid's name: ");
        String desck = input.ask("Please enter the bid's desk: ");
        String create = input.ask("Please enter the bid's create date: ");
        tracker.addItem(new Item(name, desck, create));
    }

}

