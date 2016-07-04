package ru.serg;

/**
 * Created by Serg on 24.05.2016.
 */
public class NameValidation implements Validator  {

    private String name;

    Storage storage = new UserStorage();

    public NameValidation(String name) {
        this.name = name;
    }

    public boolean check(User name) {
        boolean result = false;
        if (name.getName().equals(name)){
            storage.add(name);
            result = true;
        }
        return result;
    }


}
