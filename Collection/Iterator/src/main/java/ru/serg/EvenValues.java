package ru.serg;

import java.util.Iterator;

/**
 * @author Sergey Miheev. Create on 24.08.2016
 * @version 1.0
 */
public class EvenValues implements Iterator<Integer> {

    private int index = 0;
    private int [] value;

    public EvenValues(int[] value) {
        this.value = value;
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
