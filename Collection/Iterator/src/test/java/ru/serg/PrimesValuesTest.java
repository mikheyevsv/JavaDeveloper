package ru.serg;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * @author Sergey Miheev. Create on 17.08.2016
 * @version 1.0
 */


public class PrimesValuesTest {

    @Test
    public void whenPassesThroughArrayIteratorMovesForward() {
        PrimesValues primesValues = new PrimesValues(new int[]{-6, 0, 5});

        int result = primesValues.next();

        assertThat(result, is(5));
    }

    @Test
    public void whenIteratorMovedThroughArrayShouldReturnCorrectValue(){

        PrimesValues primesValues = new PrimesValues(new int[]{3});

        boolean res = primesValues.hasNext();

        assertThat(res, is(false));
    }


}