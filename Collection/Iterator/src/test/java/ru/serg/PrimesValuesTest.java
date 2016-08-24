package ru.serg;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * @author Sergey Miheev. Create on 17.08.2016
 * @version 1.0
 */


public class PrimesValuesTest {

    @Test
    public void whenPassesThroughArrayIteratorMovesForward() {

        PrimesValues iterator = new PrimesValues(new int[]{1, 2, 3});

        iterator.next();
        iterator.next();
        iterator.next();
        boolean res = iterator.hasNext();

        assertThat(res, is(false));
    }

    @Test
    public void whenIteratorMovedThroughArrayShouldReturnCorrectValue(){
        PrimesValues iterator = new PrimesValues(new int[]{1, 2, 3, 4});
        int [] exp = new int[]{2, 3, 4};

        int index = 0;
        int [] act = new int[exp.length];
        while (iterator.hasNext()){
            act[index++] = iterator.next();
        }

        assertThat(Arrays.toString(act), is(Arrays.toString(exp)));
    }


}