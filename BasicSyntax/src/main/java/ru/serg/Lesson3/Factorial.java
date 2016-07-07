package ru.serg.Lesson3;

/**
 * Created by Serg on 24.02.2016.
 */
public class Factorial {

    public int factor(int x){
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact *=i;
        }
        return fact;
    }
}
