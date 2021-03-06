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
    public void whenAddElementInStackShouldReturnTrue(){

        String res = ss.push("one");

        assertTrue(res, true);
    }

    @Test
    public void whenAddElementInStackShouldReturnFalse(){

        String res = ss.push("");

        assertFalse(res, false);
    }

    @Test
    public void testPopWhenStackIsNotEmptyShouldReturnLastAddedWithDeleting() {
        this.ss.push("first");
        String first = this.ss.pop();

        assertThat(first, is("first"));

    }
}