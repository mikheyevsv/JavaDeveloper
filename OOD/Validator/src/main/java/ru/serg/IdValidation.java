package ru.serg;

/**
 * Created by Serg on 27.05.2016.
 */
public class IdValidation implements Validator{
    private int id;
    Storage storage = new UserStorage();
    public IdValidation(int id) {
        this.id = id;
    }

    public boolean check(User id) {
        boolean result = false;
        if (id.getId() >= this.id){
            storage.add(id);
            result = true;
        }
        return result;
    }
}
