package ru.serg.Lesson1.Lesson1_1;

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

    public void close() throws IOException {
        reader.close();
    }

    public int proverka(int value) throws IOException {

            if (value % 1 == 0) {
                System.out.println(String.format("Integer %s", value));
            } else {
                System.out.println(String.format("Not integer %s", value));
            }
        return value;
    }


    public double input (String value){
        return Integer.parseInt(value);
    }

    public static void main(String[] args) throws IOException {
        IntegerValues iv = new IntegerValues();
        try {
            int value = (int) iv.input(iv.ask());
            iv.proverka(value);
            iv.close();
        }catch (NumberFormatException nfe){
            System.err.println("Generally some sort of crap");
        }
    }
}
