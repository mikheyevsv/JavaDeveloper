package ru.serg;

/**
 * Created by Serg on 09.09.2016.
 */
public interface Container <E> extends Iterable<E> {

    void add(E element);
    E get(int index);
}
