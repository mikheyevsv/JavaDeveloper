package ru.serg;

import java.util.Iterator;

/**
 * Created by Serg on 22.09.2016.
 */
public class SimpleStack<E> implements StackContainer<E>, Iterable<E> {

    private SimpleLinkedLict<E> stack;

    public SimpleStack() {
        this.stack = new SimpleLinkedLict<>();
    }

    @Override
    public E push(E element) {
        this.stack.add(element);
        return element;
    }

    @Override
    public E pop() {
        E result = null;
        if (stack.size() != 0) {
            result = stack.get(stack.size() - 1);
        }
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return stack.iterator();

    }
}
