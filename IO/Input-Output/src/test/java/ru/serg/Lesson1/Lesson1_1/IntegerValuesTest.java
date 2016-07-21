package ru.serg.Lesson1.Lesson1_1;

import org.junit.Before;
import org.junit.Test;
import ru.serg.Lesson1.Lesson1_1.IntegerValues;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by Serg on 19.07.2016.
 */
public class IntegerValuesTest {
    private IntegerValues iv;

    @Before
    public void initialize(){
        iv  = new IntegerValues();
    }

    @Test
    public void proverka() throws Exception {
        double res = iv.proverka(2d);
        assertThat(2d, is(equalTo(res)));
        iv = null;
    }

}