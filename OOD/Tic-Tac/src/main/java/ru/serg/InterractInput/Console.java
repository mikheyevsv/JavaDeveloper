package ru.serg.InterractInput;

import ru.serg.model.Exceptions;

import java.util.Scanner;

/**
 * Created by Serg on 30.06.2016.
 */
public class Console implements UserInput {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askUser(String question, int fieldSize) {
        System.out.print(question);
        while (true) {
            try {

                    String nextLine = scanner.nextLine();
                    if (nextLine.length() != 2) {
                        throw new Exceptions("going beyond the field");
                    } else if (Character.getNumericValue(nextLine.charAt(0)) > fieldSize || Character.getNumericValue(nextLine.charAt(1)) > fieldSize) {
                        throw new Exceptions("going beyond the field");
                    } else {
                        Long.parseLong(nextLine);
                    }
                    return nextLine;
                }catch (NumberFormatException nfe){
                    System.out.println("Invalid value coordinate. " + question);
                }catch (Exceptions exc){
                System.out.println(exc.getMassage() + question);
             }
        }
    }
}

