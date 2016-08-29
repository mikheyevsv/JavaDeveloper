package ru.serg;

import java.util.Iterator;

/**
 * @author Sergey Miheev. Create on 29.08.2016
 * @version 1.0
 */
public class ConvertIterator implements Iterator<Integer> {

    private Iterator<Iterator<Integer>> iterator;
    private Iterator<Integer>position;

    public Iterator<Integer> convertation (Iterator<Iterator<Integer>> iterator){
        this.iterator = iterator;
        return this;
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }
}
