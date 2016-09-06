package ru.serg;

/**
 * Created by Serzhik on 05.09.2016.
 */
public interface Store<T extends Base> {

    boolean add (T a);

    boolean delete (T d);

    boolean update (T u);

    T get (String id);
}
