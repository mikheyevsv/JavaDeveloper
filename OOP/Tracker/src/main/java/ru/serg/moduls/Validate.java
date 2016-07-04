package ru.serg.moduls;

import ru.serg.maket.MenuTracker;

/**
 * @author Serg.
 * This class checks the validity of user input.
 */
public class Validate extends ConsoleInput {

    /**
     * This method checks you entered is correct.
     * @param question
     * @param range
     * @return
     */

    public int ask(String question, int[] range){
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            }
            catch (MenuErrors me) {
                System.out.println("Please select key from menu!! ");
            }
           catch (NumberFormatException nfe) {
               System.out.println("Please enter valid data!! ");
           }
        }while (invalid) ;
            return value;
    }
}

