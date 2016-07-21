package ru.serg.Lesson1.Lesson1_2;

import org.junit.Before;
import org.junit.Test;
import ru.serg.Lesson1.Lesson1_1.IntegerValues;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by Serg on 20.07.2016.
 */
public class SummaTest {
    private Summa summa;

    @Before
    public void initialize(){
        summa  = new Summa();
    }

    @Test
    public void summ() throws Exception {
        double res = summa.summ(1d, 2d);
        assertThat(3d, is(equalTo(res)));
        summa = null;
    }
}