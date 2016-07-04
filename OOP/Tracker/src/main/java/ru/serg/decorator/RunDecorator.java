package ru.serg.decorator;

/**
 * Created by Serg on 13.04.2016.
 */
public class RunDecorator {
    public static void main(String[] args) {
        PrinterInterface printer = new Hi(new Ungry(new World(new Printer(""))));
        printer.print();
    }
}
