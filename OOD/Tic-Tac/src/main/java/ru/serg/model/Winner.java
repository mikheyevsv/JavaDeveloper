package ru.serg.model;

import java.util.Arrays;

/**
 * Created by Serg on 14.07.2016.
 */
public class Winner {


    public static void main(String[] args) {

        Winner win = new Winner();
        System.out.println(win.isRavno(new int[]{1, 1, 1,1,1,1,1}));

    }

    public  boolean isRavno(int [] array){

        for (int i = 0; i < array.length -1 ; i++) {
            if (array[i] != array[i+1]){
                return false;
            }
        }return true;
    }
}

