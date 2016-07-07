package ru.serg.moduls;

/**
 * @author Serg.
 * This class generates an error message.
 */
public class MenuErrors extends RuntimeException {

    /**
     * Constructor MenuErrors.
     * @param message
     */

    public MenuErrors(String message) {
        super(message);
    }
}
