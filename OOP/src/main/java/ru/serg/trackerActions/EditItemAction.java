package ru.serg.trackerActions;

import ru.serg.maket.Bid;
import ru.serg.maket.Tracker;
import ru.serg.moduls.BaseAction;
import ru.serg.moduls.Input;

/**
 * @author Serg
 * The class edit the Item.
 */
public class EditItemAction extends BaseAction {

    /**
     * Constructor EditItemAction.
     * @param name
     */

    public EditItemAction(String name) {
        super(name);
    }

    /**
     * @see super key.
     * @return
     */

    @Override
    public int key() {
        return 2;
    }

    /**
     * @see super execute.
     * @param input
     * @param tracker
     */

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Please enter uour bid's id: ");
        String name = input.ask("Please enter the bid's name: ");
        String desk = input.ask("Please enter the bid's desk: ");
        String create = input.ask("Please enter the bid's create date: ");
        Bid bid = new Bid(name, desk, create);
        bid.setId(id);
        tracker.editItem(bid);
    }

}
