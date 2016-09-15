package ru.serg;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Serg on 15.09.2016.
 */
public class SimpleLinkedLictTest {

    private static SimpleLinkedLict<String>linkedLict;

    @BeforeClass
    public static void initialize(){
        linkedLict = new SimpleLinkedLict<>();
    }

    @Test
    public void testAddOneElement(){
        linkedLict.add("0");

        int res = linkedLict.size();

        assertThat(res, is(1));
    }

    @Test
    public void testAddTwoElement(){
        linkedLict.add("0");
        linkedLict.add("1");

        int res = linkedLict.size();

        assertThat(res, is(2));
    }
}