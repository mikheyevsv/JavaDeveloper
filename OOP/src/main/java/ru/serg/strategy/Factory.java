package ru.serg.strategy;

/**
 * Created by Serg on 12.04.2016.
 */
public class Factory implements ShapeCreator {

    @Override
    public Shape getShape(String name) {
        Shape shape = null;
        if("rect".equals(name)){
            shape = new Rectangle();
        }else if ("triang".equals(name)){
            shape = new Triangle();
        }else if ("circ".equals(name)){
            shape = new Circle();
        }
        return shape;
    }
}
