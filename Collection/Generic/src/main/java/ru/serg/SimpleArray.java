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

    public void update(int position, T val){
        container[position] = val;
    }

    public void delete(T position){
        System.arraycopy(this.container, 0, this.container, 0, (Integer) position);
        System.arraycopy(this.container, (Integer) position+1, this.container, (Integer) position, this.index);
    }

    public T get(int position)
    {
        return (T) this.container[position] ;
    }

}
