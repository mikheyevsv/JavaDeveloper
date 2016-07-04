package ru.serg.decorator;

/**
 * Created by Serg on 13.04.2016.
 */
public class Ungry extends Decorator {
    public Ungry(PrinterInterface intervace) {
        super(intervace);
    }

    @Override
    public void print() {
        System.out.print("ungry ");
        super.print();
    }
}
