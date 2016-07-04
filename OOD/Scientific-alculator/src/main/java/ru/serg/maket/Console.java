package ru.serg.maket;

import java.util.Scanner;

/**
 * Created by Serg on 28.04.2016.
 */
public abstract class Console {

    private Scanner scanner = new Scanner(System.in);

     public String getScaner(){
         return scanner.next();
     }
}
