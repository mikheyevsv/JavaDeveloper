package ru.serg.Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg on 19.07.2016.
 */
public class IntegerValues {

    public  String ask() throws IOException {
        System.out.println("Enter value");
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       return reader.readLine();
    }

    public double proverka(double value) throws IOException {

            if (value % 1 == 0){
                System.out.println("Integer");
            }else {
                System.out.println("not integer");
            }
        return value;
    }


    public double input (String value){
        return Double.parseDouble(value);
    }

    public static void main(String[] args) throws IOException {
        IntegerValues iv = new IntegerValues();

        double value = iv.input(iv.ask());
        iv.proverka(value);
    }

}
