package ru.serg;

/**
 * Created by Serg on 24.05.2016.
 */
public class RunValidator {

    public static void main(String[] args) {

        User user0 = new User(123, 23, "Vasya");
        User user1 = new User(321, 20, "Tanya");
        User user2 = new User(222, 22, "Serg");

        AgeValidation ageValidation = new AgeValidation(13);

        ageValidation.check(new User(11, 12, "1ddd"));

    }
}
