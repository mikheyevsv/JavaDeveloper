package ru.serg.Lesson4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by Serg on 29.02.2016.
 */
public class DublStringTest {

    @Test
     public void removeDubleStringTest(){
        String arr []  = {"a","a"};
        String sortArr [] = {"a"};
        DublString dubl = new DublString();
        String []sort = dubl.removeDubleString(arr);
        assertThat(sort, is(sortArr));
    }
}