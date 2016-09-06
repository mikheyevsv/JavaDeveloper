package ru.serg.Storages;

import ru.serg.Employe.User;
import ru.serg.SimpleArray;
import ru.serg.Store;

/**
 * Created by Serzhik on 05.09.2016.
 */
public class UserStore implements Store<User> {

    private SimpleArray<User> user;

    public UserStore(int size) {
        this.user = new SimpleArray<>(size);
    }

    @Override
    public void add(User value) {
        user.add(value);
    }

    @Override
    public void delete(int position) {
        user.delete(position);
    }

    @Override
    public void update(int position, User val) {
        user.update(position, val);
    }

    @Override
    public User get(int position) {
        return user.get(position);
    }
}
