package ru.serg;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Serzhik on 02.09.2016.
 */
public class SimpleArrayTest {

    private static SimpleArray sa;

    @BeforeClass
    public static void initialize(){
         sa = new SimpleArray<String>(4);
    }yy

    @Test
    public void whenCreateContainerShouldReturnSameType(){
        sa.add("test");
        String res = (String) sa.get(0);

        assertThat(res, is("test"));
    }
}