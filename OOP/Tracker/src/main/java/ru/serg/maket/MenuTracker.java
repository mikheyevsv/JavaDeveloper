package ru.serg.maket;

import ru.serg.trackerActions.*;
import ru.serg.moduls.Action;
import ru.serg.moduls.Input;


/**
 *  @author Serg
 *  Created MenuTracker.
 */
public class MenuTracker {

    /**
     *
     * @see Input .
     */

    private Input input;

    /**
     *  @see Tracker .
     */

    private Tracker tracker;

    /**
     * @see Action .
     */

    private Action[] actions = new Action[5];

    /**
     *  Position in menu Tracker/
     */

    private int menuposition = 0;

    /**
     *  Constructor
     * @param input
     * @param tracker
     */

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Fill Action creatind object a menu.
     */

    public void fillActions(){

        this.actions[menuposition++] = new AddItemAction("0. Add the new item: ");
        this.actions[menuposition++] = new ShowItemAction("1. Show all the items's: ");
        this.actions[menuposition++] = new EditItemAction("2. Edit uour item: ");
        this.actions[menuposition++] = new SearchItemById("3. Search uour item by ID: ");
        this.actions[menuposition++] = new DeleteItemAction("4. Delete uour item: ");

    }

    /**
     * Select key in menu a tracer.
     * @param key
     */

    public void select (int key){
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * Venu shows a list of the tracker.
     */

    public void show(){
        for (Action action : this.actions) {
            if (action != null)
            System.out.println(action.info());
        }        
    }

}
