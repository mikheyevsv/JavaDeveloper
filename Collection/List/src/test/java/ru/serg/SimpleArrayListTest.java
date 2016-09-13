package ru.serg;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Serg on 09.09.2016.
 */
public class SimpleArrayListTest {

    @Test
    public void whenAddElementHaveCapacity(){
        SimpleArrayList<Integer>list = new SimpleArrayList<>(2);
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void whenAddElementDontHaveCapacity(){
        SimpleArrayList<String>list = new SimpleArrayList<>(2);
        list.add("one");
        list.add("two");

    }

    @Test
    public void whenAddElementIntegerShouldReturnElement(){
        SimpleArrayList<String>list = new SimpleArrayList<>(1);
        list.add("one");
        list.add("two");

        String res = list.get(2);

        assertNull(res, null);
    }

}