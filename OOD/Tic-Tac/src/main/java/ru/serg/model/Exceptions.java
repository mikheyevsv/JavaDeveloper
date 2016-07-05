package ru.serg.model;

/**
 * @author Serg
 * @since
 */
public class Exceptions extends Exception {
    private String massage;

    public Exceptions( String massage) {
        this.massage = massage;
    }

    public Exceptions(String message, Throwable cause) {
        super(cause);
        message = message;

    }

    public String getMassage() {
        return massage;
    }
}
