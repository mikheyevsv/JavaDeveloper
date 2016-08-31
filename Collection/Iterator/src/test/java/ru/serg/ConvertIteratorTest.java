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
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        List<Iterator<Integer>> combo = new ArrayList<>(Arrays.asList(list1.iterator(), list2.iterator()));
        Iterator<Integer> iterator = convertIterator.convertation(combo.iterator());

        int act [] = new int[6];
        int exp [] = {1, 2, 3, 4, 5, 6};
        int index = 0;
        while (iterator.hasNext()){
            act[index++] = iterator.next();
        }

        assertArrayEquals(exp, act);
    }

}