package ru.serg;

import java.util.Iterator;

/**
 * @author Sergey Miheev. Create on 29.08.2016
 * @version 1.0
 */
public class ConvertIterator implements Convert{

    private Iterator<Iterator<Integer>> iterators;
    private Iterator<Integer>position;

    @Override
    public Iterator<Integer> convertation (final Iterator<Iterator<Integer>> it){
        this.iterators = it;
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
