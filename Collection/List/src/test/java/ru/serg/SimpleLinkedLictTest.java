package ru.serg;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Serg on 15.09.2016.
 */
public class SimpleLinkedLictTest {


    @Test
    public void testAddOneElement(){
        SimpleLinkedLict<String>linkedLict = new SimpleLinkedLict<>();
        linkedLict.add("0");

        int res = linkedLict.size();

        assertThat(res, is(1));
    }

    @Test
    public void testAddTwoElement(){
        SimpleLinkedLict<String>linkedLict = new SimpleLinkedLict<>();
        linkedLict.add("0");
        linkedLict.add("1");

        int res = linkedLict.size();

        assertThat(res, is(2));
    }

    @Test
    public void testGetTwoElement(){
        SimpleLinkedLict<String>linkedLict = new SimpleLinkedLict<>();
        linkedLict.add("0");
        linkedLict.add("1");

        String res = linkedLict.get(0);
        int size = linkedLict.size();

        assertThat(res, is("0"));
        assertThat(size, is(2));
    }

    @Test
    public void testGetOneElement(){
        SimpleLinkedLict<String>linkedLict = new SimpleLinkedLict<>();
        linkedLict.add("0");

        String res = linkedLict.get(0);
        int size = linkedLict.size();

        assertThat(res, is("0"));
        assertThat(size, is(1));
    }
}