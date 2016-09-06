package ru.serg.Storages;

import ru.serg.Employe.Role;
import ru.serg.Employe.User;
import ru.serg.SimpleArray;
import ru.serg.Store;

/**
 * Created by Serzhik on 05.09.2016.
 */
public class  RoleStore implements Store<Role>{

    private SimpleArray<Role> role;

    public RoleStore(int size) {
        this.role = new SimpleArray<>(size);
    }
    @Override
    public void add(Role value) {
        role.add(value);
    }

    @Override
    public void delete(int position) {
        role.delete(position);
    }

    @Override
    public void update(int position, Role val) {
        role.update(position, val);
    }

    @Override
    public Role get(int position) {
        return role.get(position);
    }
}
