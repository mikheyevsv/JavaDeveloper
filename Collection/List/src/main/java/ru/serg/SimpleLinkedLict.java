package ru.serg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Serg on 14.09.2016.
 */
public class SimpleLinkedLict <E> implements Container<E>, Iterable<E> {

    private int size = 0;
    private Entry<E> firstEntry;

    @Override
    public void add(E element) {
        if (firstEntry != null){
            Entry<E> lastEntry = getEntry(this.firstEntry);
            lastEntry.next = new Entry<>(element, null);
        }else {
            this.firstEntry = new Entry<>(element, null);
        }
        size++;
    }

    @Override
    public E get(int index) {
        Entry<E> entry = this.firstEntry;
        for (int i = 0; i < index ; i++) {
            entry = entry.next;
        }
        return entry.element;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator<>();
    }

    public int size(){
        return this.size;
    }

    private Entry<E> getEntry(Entry<E> eEntry){
        Entry<E> res = eEntry;
        if (eEntry.next != null){
            res = getEntry(eEntry.next);
        }
        return res;
    }


    private class Entry<E>{
        E element;
        Entry<E>next;


        public Entry(E element, Entry<E> next) {
            this.element = element;
            this.next = next;

        }
    }

    private class LinkedListIterator<E> implements Iterator<E>{

        private int current = 0;

        @Override
        public boolean hasNext() {
            boolean res = false;
            if (current < size){
                res = true;
            }
            return res;
        }

        @Override
        public E next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            E res = (E) get(current++);
            return res;
        }
    }
}
