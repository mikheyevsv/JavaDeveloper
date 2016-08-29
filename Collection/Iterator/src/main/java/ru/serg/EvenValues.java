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
        boolean result = false;
        int i = this.index;
        while (++i < this.value.length) {
            if (this.value[i] % 2 == 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public Integer next() {
        int result = -1;

        while (index < value.length) {
            if (value[index] % 2 == 0) {
                result = value[index];
                index++;
                break;
            }
            index++;
        }
        return result;
    }
}
