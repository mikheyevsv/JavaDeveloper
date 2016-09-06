package ru.serg.Employe;

import ru.serg.Base;

/**
 * Created by Serzhik on 05.09.2016.
 */
public class Role extends Base {

    private String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
