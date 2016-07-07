package ru.serg.Lesson1.Compare;

import java.util.Random;

/**
 * Created by Serg on 12.02.2016.
 */
public class ArrayMax {

    Random rand = new Random();

    public int max(int[] array){

    int max = array[0];
      for (int i = 0; i <array.length; i++) {
           if (max < array[i]) {
               max = array[i];
           }
        }
        return max;
   }
    public int[] generate(int size){
         int mas[] = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(200);

        }
        return mas;
    }
}
