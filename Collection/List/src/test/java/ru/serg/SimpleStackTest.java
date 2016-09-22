package ru.serg;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Serg on 22.09.2016.
 */
public class SimpleStackTest {

    SimpleStack<String> ss = new SimpleStack<>();

    @Test
    public void whenAddElementInStackShouldElementAddInHead(){

        String res = ss.push("one");

        assertTrue(res, true);
    }

}