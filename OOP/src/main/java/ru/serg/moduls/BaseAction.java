package ru.serg.moduls;

import ru.serg.maket.Tracker;

/**
 * @author Serg.
 * Default realisation Action.
 */
public abstract class BaseAction implements Action {

    /**
     * Default name.
     */

    private String name;

    /**
     * Constructor BaseAction.
     * @param name
     */

    public BaseAction(String name){
        this.name = name;
    }

    /**
     *
     * @see Action .
     * @return
     */

    public  abstract int key();

    /**
     * @see Action .
     * @param input
     * @param tracker
     */

    public abstract void execute(Input input, Tracker tracker);

    /**
     * @see Action .
     * @return
     */

    public String info(){
        return name;
    }
}
