package ru.serg.decorator;

/**
 * Created by Serg on 13.04.2016.
 */
public abstract class Decorator implements PrinterInterface {
    PrinterInterface anInterface;

    public Decorator(PrinterInterface intervace) {
        this.anInterface = intervace;
    }

    public void print(){
        anInterface.print();
    }
}
