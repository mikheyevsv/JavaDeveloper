package ru.serg.Lesson1;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by Serg on 09.02.2016.
 */
public class CalculateTest {

    private Calculate calculate = new Calculate();

    @Test
    public void testAdd() throws Exception {
        double res = calculate.add(2d, 1d);
        assertThat(3d, is(equalTo(res)));
    }

    @Test
    public void testSub() throws Exception {
        double res = calculate.sub(2d, 1d);
        assertThat(1d, is(equalTo(res)));
    }

    @Test
    public void testMult() throws Exception {
        double res = calculate.mult(2d, 3d);
        assertThat(6d, is(equalTo(res)));
    }

    @Test
    public void testDiv() throws Exception {
        double res = calculate.div(4d, 2d);
        assertThat(2d, is(equalTo(res)));
    }
}