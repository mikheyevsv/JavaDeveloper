package ru.serg;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Sergey Miheev. Create on 29.08.2016
 * @version 1.0
 */
public class ConvertIteratorTest {

    @Test
    public void whenCombineIteratorRunsOnAllOperators(){
        ConvertIterator convertIterator = new ConvertIterator();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(4, 2, 0, 4, 6, 4, 9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(0, 9, 8, 7, 5));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 7, 0, 9, 8, 4));

        List<Iterator<Integer>> combo = new ArrayList<>(Arrays.asList(list1.iterator(), list2.iterator(),
                                                                      list3.iterator()));
        Iterator<Integer> iterator = convertIterator.convertation(combo.iterator());

        int exp [] = new int[21];
        int act [] = {4, 2, 0, 4, 6, 4, 9, 0, 9, 8, 7, 5, 1, 3, 5, 6, 7, 0, 9, 8, 4};
        int index = 0;
        while (iterator.hasNext()){
            act[index++] = iterator.next();
        }

        assertArrayEquals(exp, act);
    }

}