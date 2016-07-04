package ru.serg.decorator;

/**
 * Created by Serg on 13.04.2016.
 */
public class Hi extends Decorator {
    public Hi(PrinterInterface intervace) {
        super(intervace);
    }

    @Override
    public void print() {
        System.out.print("Hi ");
        super.print();
    }
}
