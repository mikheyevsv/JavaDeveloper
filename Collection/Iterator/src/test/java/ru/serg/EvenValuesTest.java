package ru.serg;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
/**
 * @author Sergey Miheev. Create on 24.08.2016
 * @version 1.0
 */
public class EvenValuesTest {

    @Test
    public void whenPassesThroughArrayIteratorMovesForward(){
        EvenValues even = new EvenValues(new int[]{1,3,5,6});
        int res = 0;

        while (even.hasNext()){
            res = even.next();
        }
        assertThat(res, is(6));
    }
    @Test
    public void whenPassesThroughArrayIteratorMovesForward1(){
        EvenValues even = new EvenValues(new int[]{1, 2, 3, 5, 6});

        even.hasNext();
        even.hasNext();
        even.hasNext();
        even.hasNext();
        even.hasNext();

        assertThat(even.next(),is(2));
    }
    @Test
    public void whenPassesThroughArrayIteratorMovesForward2(){
        EvenValues even = new EvenValues(new int[]{1, 2, 3, 5, 6});

        even.next();
        even.hasNext();
        even.hasNext();
        even.hasNext();
        even.hasNext();
        even.hasNext();

        assertThat(even.next(),is(6));
    }


}