package ru.serg;

import ru.serg.Compare.ArrayMax;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CompareTest {


    @Test
    public void generateTest() {
//       int size = 5;
        ArrayMax arrayMax = new ArrayMax();
        int[] first = arrayMax.generate(5);
        int[] second = arrayMax.generate(4);
        boolean unic = false;
        for (int i = 0; i <5; i++) {
            if(first[i] != second[i]){
               unic = true;
                break;
            }
        }
        assertTrue(unic);
    }
    @Test
    public void maxTest(){
        int mas[] = new int[]{1,0,3};
        ArrayMax arrmax = new ArrayMax();
        assertEquals(3, arrmax.max(mas));
    }
}

