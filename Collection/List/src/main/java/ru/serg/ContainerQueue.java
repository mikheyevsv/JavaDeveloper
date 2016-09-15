package ru.serg;

/**
 * Created by Serg on 15.09.2016.
 */
public interface ContainerQueue <E> {

    void enqueue(E elem);

    E dequeue();
}
