package ru.serg;


import java.util.Arrays;

/**
 This class runs the program.
 * @author Serg
 */
public class MenuRealisation {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printMenu(Arrays.asList(
                new Menu("Задача 1", null),
                new Menu("Задача 1.1", "Задача 1"),
                new Menu("Задача 1.2", "Задача 1.1"),
                new Menu("Задача 2", null)
        ));
    }
}
