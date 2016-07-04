package ru.serg;

import ru.serg.maket.MenuTracker;
import ru.serg.maket.Tracker;
import ru.serg.moduls.*;

/**
 * @author Serg on 14.03.2016.
 * Start Tracker.
 */
public class StartUI {
    /**
     * Array rengers.
     */
    private int [] renges = {0,1,2,3,4};

    /**
     * @see Input .
     */

    private final Input input;

    /**
     * @see Tracker .
     */

    private final Tracker tracker;

    /**
     * @see MenuTracker .
     */

    private final MenuTracker menu;


    /**
     * Constructor
     *  @param input Input.
     * @param tracker Tracker.
     * @param menu MenuTracker.
     */
    public StartUI(final Input input, final MenuTracker menu, final Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
        this.menu = menu;
    }

    /**
     * Initialization main loop.
     * @throws MenuErrors
     */

    public void init()  {
            do {
                menu.show();
                    menu.select(input.ask("Select key ", renges));
            }while (!"y".equals(this.input.ask("Exit? y")));
        }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Input input = new Validate();
        MenuTracker menu = new MenuTracker(input, tracker);
        menu.fillActions();
            new StartUI(input, menu, tracker).init();

    }
}
