package ru.serg;

/**
 * Created by Serg on 27.05.2016.
 */
public class AgeValidation implements Validator {

    private int age;
    Storage storage = new UserStorage();
    public AgeValidation(int age) {
        this.age = age;
    }

    public boolean check(User age) {
        boolean result = false;
        if (age.getAge() >= this.age){
            storage.add(age);
            result = true;
        }
        return result;
    }
}
