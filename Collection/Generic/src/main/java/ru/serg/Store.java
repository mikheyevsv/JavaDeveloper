package ru.serg;

/**
 * Created by Serzhik on 05.09.2016.
 */
public interface Store<T extends Base> {

    void add (T value);

    void delete(int position);

    void update(int position, T val);

    T get(int position);
}
