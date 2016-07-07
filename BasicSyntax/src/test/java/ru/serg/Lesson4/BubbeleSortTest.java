package ru.serg.Lesson4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by Serg on 26.02.2016.
 */
public class BubbeleSortTest {

    @Test
    public void bubbleSortTest(){
        int mas[] = {3,1};
        BubbeleSort bubbele = new BubbeleSort();
        int[] sort = bubbele.bubbleSort(mas);
        assertEquals(sort, mas);
    }

    @Test
    public  void testingTwoParameters(){
        BubbeleSort bubbele = new BubbeleSort();
        int[] input = {1,0};
        int[] check = {0,1};
        int[] sort = bubbele.bubbleSort(input);
        assertThat(sort, is(equalTo(check)));
    }
}
