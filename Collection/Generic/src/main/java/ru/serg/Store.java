package ru.serg;

/**
 * Created by Serzhik on 05.09.2016.
 */
public interface Store<T extends Base> {

    void add (T value);

    void delete(int id);

    void update(int id, T val);

    T get(int id);
}
