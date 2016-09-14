package ru.serg;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Serg on 14.09.2016.
 */
public class SimpleLinkedLict <E> implements Container<E>, Iterable<E> {



    @Override
    public void add(E element) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator<>();
    }

    private class Entry<E>{
        E element;
        Entry<E>next;
        Entry<E>prev;

        public Entry(E element, Entry<E> next, Entry<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private class LinkedListIterator<E> implements Iterator<E>{

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
