package ru.serg.InterractInput;

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

                String nextLine = scanner.nextLine();
                if(nextLine.length() != 2) {
                } else if(Character.getNumericValue(nextLine.charAt(0))>fieldSize || Character.getNumericValue(nextLine.charAt(1))>fieldSize) {

                }
                else {
                    Long.parseLong(nextLine);
                }
                return nextLine;
            }
        }
    }

