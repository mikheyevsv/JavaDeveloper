package ru.serg.Lesson1.Lesson1_1;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.serg.Lesson1.Lesson1_1.IntegerValues;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by Serg on 19.07.2016.
 */
public class IntegerValuesTest {
    private static IntegerValues iv;

    @BeforeClass
    public static void initialize(){
        iv = new IntegerValues();
    }

    @Test
    public void proverka() throws Exception {
        int res = iv.proverka(2);
        assertThat(2, is(equalTo(res)));

    }

}