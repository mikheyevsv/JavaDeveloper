package ru.serg.Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg on 19.07.2016.
 */
public class IntegerValues {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public  String ask() throws IOException {
        System.out.println("Enter value");
        return reader.readLine();
    }



    public double proverka(double value) throws IOException {
        try {
            if (value % 1 == 0) {
                System.out.println("Integer");
            } else {
                System.out.println("not integer");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("For  string");
        } finally {
            reader.close();
        }return value;
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
