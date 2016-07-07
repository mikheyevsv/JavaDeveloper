package ru.serg.Lesson4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by Serg on 26.02.2016.
 */
public class RotationMatrixTest {

    @Test
    public void testRotationMatrix() throws Exception {
        RotationMatrix rotmatr = new RotationMatrix();
        int [][] matr = {{1,0},
                         {0,1}
                        };
        int[][] rot = rotmatr.rotationMatrix(matr);
        assertThat(matr, is((rot)));
    }
}