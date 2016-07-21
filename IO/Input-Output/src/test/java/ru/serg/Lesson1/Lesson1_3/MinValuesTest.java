package ru.serg.Lesson1.Lesson1_3;

import static org.hamcrest.CoreMatchers.*;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Serg on 21.07.2016.
 */
public class MinValuesTest {
    private static MinValues min;

    @BeforeClass
    public static void initialise(){
        min = new MinValues();
    }

    
    @Test
    public void minValuesTest() throws Exception {
        double res = min.minValues(1d, 2d, 3d);
        assertThat(1d, is(equalTo(res)));
    }
}