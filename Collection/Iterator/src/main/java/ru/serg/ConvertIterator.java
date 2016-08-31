package ru.serg;

import java.util.Iterator;

/**
 * @author Sergey Miheev. Create on 29.08.2016
 * @version 1.0
 */
public class ConvertIterator implements Iterator<Integer>{

    private Iterator<Iterator<Integer>> iterators;
    private Iterator<Integer>position;


    public Iterator<Integer> convertation (Iterator<Iterator<Integer>> iterators){
        this.iterators = iterators;
        return this;
    }


    @Override
    public boolean hasNext() {
        return iterators.hasNext();
    }

    @Override
    public Integer next() {
        if(position == null){
            position = iterators.next();
        }else if (!position.hasNext()){
            position = iterators.next();
        }
        return position.next();
    }
}
