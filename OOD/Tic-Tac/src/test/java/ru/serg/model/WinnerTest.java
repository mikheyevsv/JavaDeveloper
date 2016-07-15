package ru.serg.model;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by Serg on 15.07.2016.
 */
public class WinnerTest {
    Winner win = new Winner();
    @Test
    public void whenAllValuesAre() throws Exception {

        boolean res = win.isRavno( new int [] {1,1,1,1});
        assertThat(true, is(equalTo(res)));
    }
    @Test
    public void whenAllValuesNotAre() throws Exception {
        
        boolean res = win.isRavno( new int [] {1,0,1,1});
        assertThat(false, is(equalTo(res)));
    }

}