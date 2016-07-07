package ru.serg.Lesson3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Serg on 24.02.2016.
 */
public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    public void factorTest(){
        int res = factorial.factor(5);
        assertEquals(120, res);
    }
}
