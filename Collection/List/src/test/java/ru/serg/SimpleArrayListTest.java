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
        SimpleArrayList<Integer>list = new SimpleArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void whenAddElementDontHaveCapacity(){
        SimpleArrayList<String>list = new SimpleArrayList<>();
        list.add("one");
        list.add("two");

    }

    @Test
    public void whenAddElementIntegerShouldReturnElement(){
        SimpleArrayList<Integer>list = new SimpleArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer res = list.get(1);

        assertThat(res, is(2));
    }

}