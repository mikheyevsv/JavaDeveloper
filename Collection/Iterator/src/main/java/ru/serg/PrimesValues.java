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
        boolean result = false;
        int i = this.index;
        while (++i < this.value.length) {
            int numb = this.value[i];
            if (this.isPrime(numb)) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public Integer next() {
        int result = 0;
        while(this.index < this.value.length) {
            if(isPrime(this.value[this.index])) {
                result = this.value[this.index++];
                break;
            }
            this.index++;
        }

        return result;
    }

    private boolean isPrime(int val){
        boolean res ;
        if (val < 2){
            res = false;
        }else {
            int num = 0;
            for (int i = 2; i < num ; i++) {
                    if(num % i == 0){
                        num++;
                }
            }
            res = num == 0;
        }
        return res;
    }
}
