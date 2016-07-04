package ru.serg.decorator;

/**
 * Created by Serg on 13.04.2016.
 */
public class Printer implements PrinterInterface {

    String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println(value);
    }
}
