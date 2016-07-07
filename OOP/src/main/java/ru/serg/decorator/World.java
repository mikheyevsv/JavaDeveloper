package ru.serg.decorator;

/**
 * Created by Serg on 13.04.2016.
 */
public class World extends Decorator {
    public World(PrinterInterface intervace) {
        super(intervace);
    }

    @Override
    public void print() {
        System.out.print("world");
        super.print();
    }
}
