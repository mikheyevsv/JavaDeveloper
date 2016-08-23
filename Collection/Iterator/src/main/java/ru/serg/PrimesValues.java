package ru.serg;

import java.util.Iterator;

/**
 * @author Sergey Miheev. Create on 17.08.2016
 * @version 1.0
 */
public class PrimesValues implements Iterator <Integer>{

    private int index = 0;
    private int [] value;

    public PrimesValues(int[] value) {
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
