package ru.serg;

import java.util.Iterator;


/**
 * Created by Serg on 15.09.2016.
 */
public class SimpleQueue<E> implements ContainerQueue<E>, Iterable<E> {

    private SimpleLinkedLict<E> queue;

    public SimpleQueue() {
        this.queue = new SimpleLinkedLict<>();
    }

    @Override
    public Iterator<E> iterator() {
        return queue.iterator();
    }

    @Override
    public void enqueue(E elem) {
        this.queue.add(elem);
    }

    @Override
    public E dequeue() {
        E res = queue.iterator().next();
        return res;
    }
}
