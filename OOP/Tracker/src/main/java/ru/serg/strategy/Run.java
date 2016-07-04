package ru.serg.strategy;

/**
 * Created by Serg on 12.04.2016.
 */
public class Run {
    public static void main(String[] args) {
    ShapeCreator creator = new Factory();

        Shape shape = creator.getShape("rect");
        System.out.println(shape.getDescription());

        shape = creator.getShape("triang");
        System.out.println(shape.getDescription());

        shape = creator.getShape("circ");
        System.out.println(shape.getDescription());

    }
}
