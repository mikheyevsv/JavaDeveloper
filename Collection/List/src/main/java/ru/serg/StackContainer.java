package ru.serg;

/**
 * Created by Serg on 22.09.2016.
 */
public interface StackContainer<E> {

    E push (E element);

    E pop();
}
