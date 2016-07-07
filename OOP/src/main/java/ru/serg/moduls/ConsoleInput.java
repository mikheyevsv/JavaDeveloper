package ru.serg.moduls;

import ru.serg.maket.MenuTracker;

import java.util.Scanner;

/**
 * @author Serg.
 * This class implements user input.
 */
public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    /**
     * @see Input .
     * @param question
     * @return
     */

    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    /**
     * @see Input .
     * @param question
     * @param range
     * @return
     */

    @Override
    public int ask(String question, int[] range) {

        int key = Integer.valueOf(this.ask(question));
        boolean exit = false;
        for ( int value : range) {
            if(value == key){
                exit = true;
                break;
            }
        }
        if (exit){
        return key;
    }else {
            throw new  MenuErrors("Out of menu range");
        }
    }
}
