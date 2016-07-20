package ru.serg.Lesson1.Lesson1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg on 20.07.2016.
 */
public class Summa {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public  String ask() throws IOException {
        System.out.println("Enter value");
        return reader.readLine();
    }

    public double input (String value){
        return Double.parseDouble(value);
    }


    public double summ(double x, double y){
        return x +y;
    }

    public static void main(String[] args) throws IOException {
        Summa summa = new Summa();

        double val1 = summa.input(summa.ask());
        double val2 = summa.input(summa.ask());
        summa.summ(val1, val2);
    }
}
