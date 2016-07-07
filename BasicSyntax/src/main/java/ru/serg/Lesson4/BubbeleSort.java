package ru.serg.Lesson4;

/**
 * Created by Serg on 26.02.2016.
 */
public class BubbeleSort {
    
    public int [] bubbleSort(int[] values){
        for (int i = 0; i < values.length - 1;  i++) {
            for (int j = 0; j <= i; j++) {
                if(values[j] > values[j + 1]){
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        return values;
    }
}
