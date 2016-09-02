package ru.serg;

/**
 * Created by Serzhik on 02.09.2016.
 */
public class SimpleArray <T> {

    private int index = 0;
    private Object[] container;

    public SimpleArray(int size) {
        this.container = new Object[size];
    }

    public void add(T value){
        this.container[index++] = value;
    }

    public void update(){}

    public void delete(){}

    public T get(int pozition){
        return (T) this.container[pozition] ;
    }

}
