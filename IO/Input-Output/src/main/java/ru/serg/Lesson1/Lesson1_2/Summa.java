package ru.serg.Lesson1.Lesson1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg on 20.07.2016.
 */
public class Summa {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String askOne() throws IOException {
        System.out.println("Enter first value");
        return reader.readLine();
    }

    public String askTwo() throws IOException {
        System.out.println("Enter second value");
        return reader.readLine();
    }


    public double input(String value) {
        return Double.parseDouble(value);
    }


    public void summ(double x, double y) {

        double sum = x + y;
        System.out.println("Summa = " + sum);

    }
    public void close(){
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        Summa summa = new Summa();
        try {
            double val1 = summa.input(summa.askOne());
            double val2 = summa.input(summa.askTwo());
            summa.summ(val1, val2);
            summa.close();
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
            System.err.println("Please enter integer value");
        }
    }
}
