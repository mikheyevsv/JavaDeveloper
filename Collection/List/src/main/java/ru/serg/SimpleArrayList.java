package ru.serg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Serg on 08.09.2016.
 */
public class SimpleArrayList <E> implements Container<E>, Iterable<E> {

    private int index = 0;

    @Override
    public void add(E element) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    public Iterator<E> iterator(){
        return new ArrayIterator();
    }

    private class ArrayIterator<E> implements Iterator<E>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}
