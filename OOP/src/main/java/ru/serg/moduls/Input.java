package ru.serg.moduls;

import ru.serg.maket.MenuTracker;

/**
 * @author Serg.
 * This interface creates a basic user input/
 */
public interface Input {

    /**
     *
     * We are asking the user
     * @param question
     * @return
     */

    String ask (String question);

    /**
     * Overloaded method ask. there is checked whether the user has entered the correct key.
     * @param question
     * @param range
     * @return
     */

    int ask (String question, int[] range);
}
