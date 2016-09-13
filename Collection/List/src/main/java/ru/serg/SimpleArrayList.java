package ru.serg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Serg on 08.09.2016.
 */
public class SimpleArrayList <E> implements Container<E>, Iterable<E> {

    private int index = 0;
    private int current = 0;
    private Object [] objects;
    private boolean donext = false;
    private int GROW_COEFFICIENT = 3;
    private int DEFAULT = 3;


    public SimpleArrayList(int size) {
        if (size < 3) {
            size = DEFAULT;
        }
        this.objects = new Object[size];
    }

    @Override
    public void add(E element) {
        if (index >= objects.length){
            grow();
            objects[index++] = element;
        }

    }

    @Override
    public E get(int index) {
        return (E) objects[index];
    }

    public Iterator<E> iterator(){
        return new ArrayIterator();

    }

    private void grow() {
        Object[] newStorage = new Object[this.objects.length * GROW_COEFFICIENT];
        System.arraycopy(this.objects, 0, newStorage, 0, this.objects.length);
        this.objects = newStorage;
    }

    private class ArrayIterator<E> implements Iterator<E>{

        @Override
        public boolean hasNext() {
            boolean res = false;
            if (current < index){
                res = true;
            }
            return res;
        }

        @Override
        public E next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            E res = (E) objects[current++];
            donext = true;
            return res;
        }
    }
}
