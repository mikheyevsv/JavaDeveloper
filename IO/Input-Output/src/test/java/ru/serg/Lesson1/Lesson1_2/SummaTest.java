package ru.serg.Lesson1.Lesson1_2;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by Serg on 20.07.2016.
 */
public class SummaTest {
    Summa summa = new Summa();

    @Test
    public void summ() throws Exception {
        double res = summa.summ(2d, 1d);
        assertThat(3d, is(equalTo(res)));
    }

}