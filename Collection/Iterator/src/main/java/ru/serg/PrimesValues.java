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
        return this.index < this.value.length;
    }

    @Override
    public Integer next() {
        int res = 0;
        while (this.index < this.value.length){
           if(isPrime(this.value[this.index])){
                res = this.value[this.index++];
               break;
            }
            this.index++;
        }
        return res;
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
