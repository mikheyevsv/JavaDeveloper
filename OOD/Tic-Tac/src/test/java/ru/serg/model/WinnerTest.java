package ru.serg.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Serg on 14.07.2016.
 */
public class WinnerTest {
    @Test
    public void isRavno() {
        Winner win = new Winner();

        boolean first = win.isRavno(new int[]{1, 1, 1});
        boolean second = win.isRavno(new int[]{1, 0, 1});
        boolean res = false;
        for (int i = 0; i <3 ; i++) {
            if (first != second){
                res = true;
                break;
            }
        }
        assertTrue(res);
    }

}