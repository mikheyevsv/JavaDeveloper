package ru.serg;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
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
    }
}