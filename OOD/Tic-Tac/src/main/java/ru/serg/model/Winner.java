package ru.serg.model;

import java.util.Arrays;

/**
 * Created by Serg on 14.07.2016.
 */
public class Winner {

    int []arr = {1,1,1,1};
    public boolean isRavno(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == arr[i+1]){
                return true;

            }
        }
        return false;
    }


}
