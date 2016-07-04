package ru.serg;

import java.util.ArrayList;

/**
 * Created by Serg on 26.05.2016.
 */
public class UserStorage implements Storage {

    private Validator validator;
    private ArrayList<User> users = new ArrayList<User>();

    public UserStorage(Validator validator, ArrayList<User> users) {
        this.validator = validator;
        this.users = users;
    }

    public UserStorage(){}


    /**
     * This method add new User.
     * @param user
     * @return
     */

    public User addUser(User user){
        users.add(user);
        return user;
    }

    /**
     * This method edit User.
     * @param newUser
     */

    public void editUser(User newUser){
        for (int index = 0; index <users.size(); index++) {
            User user = users.get(index);
            if(user != null){
                this.users.set(index, newUser);
                break;
            }
        }
    }

    /**
     * This method delete User.
     * @return
     */

    public void deleteUser(int userId){
        for (User user : users) {
            if (user != null){
                users.remove(userId);
                break;
            }
        }
    }

    public void add(User user) {
        validator.check(user);
        this.users.add(user);
    }
}
