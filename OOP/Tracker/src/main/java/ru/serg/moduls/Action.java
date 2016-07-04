package ru.serg.moduls;

import ru.serg.maket.Tracker;

/**
 * @author Serg.
 * This interface creates a basic implementation of the Action Tracker.
 */
public interface Action {

     /**
      * This method shows the user key from 0 to 4 that he may enter.
      * @return
      */

     int key();

     /**
      * This method performs the main actions of the program.
      * @param input
      * @param tracker
      */

     void execute(Input input, Tracker tracker);

     /**
      * The method describes the action which the user has selected.
      * It returns information about the action as a string.
      * @return
      */

     String info();
}
