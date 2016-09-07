package ru.serg;

/**
 * Created by Serzhik on 05.09.2016.
 */
public interface Store<T extends Base> {

    boolean add (T value);

    boolean delete(String id);

    boolean update(T val);

    T get(String id);
}
