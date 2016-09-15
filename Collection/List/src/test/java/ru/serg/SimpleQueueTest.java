package ru.serg;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Serg on 15.09.2016.
 */
public class SimpleQueueTest {

    @Test
    public void testEnqueueElement(){
        SimpleQueue<String>sq = new SimpleQueue<>();

        sq.enqueue("one");

        String res = sq.dequeue();

        assertThat(res, is("one"));
    }

}