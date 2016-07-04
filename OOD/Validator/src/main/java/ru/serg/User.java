package ru.serg;

/**
 * This Class create user
 * @author Serg.
 */
public class User {
    private int id;
    private int age;
    private String name;

    /**
     * Constructor an Uaser/
     * @param id
     * @param age
     * @param name
     */
    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }


}
