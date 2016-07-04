package ru.serg;


import ru.serg.maket.Computing;
import ru.serg.maket.Console;
import ru.serg.moduls.Operations;

import java.util.Scanner;

/**@author Serg
 * Runnind Calculate.
 */
public class CalcRun extends Console {

    private Operations operations = new Operations();

    public static void main(String[] args) {

        String exitCalculate = "n";
        while (!exitCalculate.equals("yes")) {
            Scanner sc = new Scanner(System.in);
            CalcRun calcRun = new CalcRun();
            calcRun.calc();
            System.out.println("Exit : yes/no");
            exitCalculate = sc.next();
        }
    }

    public double valueOne() {
        System.out.println("Enter the first value: ");
        Double valueOne;
        try {
            valueOne = Double.valueOf(getScaner());
            return valueOne;
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            System.err.println("You entered is not a number");
        }
        return 0;
    }

    public String operation() {
        System.out.println("-, +, /, *");
        return getScaner();
    }

    public double valueTwo() {
        System.out.println("Enter the second value: ");
        Double valueTwo;
        try {
            valueTwo = Double.valueOf(getScaner());
            return valueTwo;
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            System.err.println("You entered is not a number");
        }
        return 0;
    }

    public void calc() {
        newOperation(valueOne());
    }

    private void newOperation(double valueOne) {
        Computing computing = operations.getComputing(operation());
        double valueTwo = valueTwo();
        try {
            operations.setResultat(computing.operation(valueOne, valueTwo));
        } catch (NullPointerException e) {
            System.err.println("You have entered the wrong operator.");
        } catch (NumberFormatException e) {
            System.err.println("You have entered the wrong arg.");
        }
        System.out.println("Resultat : " + operations.getResultat());
        useResult();
    }

    private void useResult() {
        System.out.println("continue (y):");
        String use;
        use = getScaner();
        if (use.equals("y")) {
            newOperation(operations.getResultat());
        }
    }
}

