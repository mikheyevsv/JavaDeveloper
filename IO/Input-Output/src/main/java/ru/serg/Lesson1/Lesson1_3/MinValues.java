package ru.serg.Lesson1.Lesson1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg on 21.07.2016.
 */
public class MinValues {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String askOne() throws IOException {
        System.out.println("Enter first value");
        return reader.readLine();
    }

    public String askTwo() throws IOException {
        System.out.println("Enter second value");
        return reader.readLine();
    }

    public String askThree() throws IOException {
        System.out.println("Enter three value");
        return reader.readLine();
    }

    public double input(String value) {
        return Double.parseDouble(value);
    }

    private void close(){
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double minValues(double one, double two, double three){
        double min = 0;
        if (one < two && one < three){
            min = one;
        }else if(three < two && three < one){
            min = three;
        }else if (two < three && two < one){
            min = two;
        }
        System.out.println("Minimum values " + min);
            return min;
    }

    public static void main(String[] args) throws IOException {
        MinValues min = new MinValues();
        try {
                double val1 = min.input(min.askOne());
                double val2 = min.input(min.askTwo());
                double val3 = min.input(min.askThree());

                min.minValues(val1, val2, val3);
                min.close();
        }catch (NumberFormatException nfe){
            System.err.println("Not a number");
        }
    }
}
