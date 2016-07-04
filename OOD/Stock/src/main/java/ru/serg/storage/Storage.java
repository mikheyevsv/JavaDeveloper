package ru.serg.storage;

import ru.serg.produkts.Product;

import java.util.List;

/**
 * Created by Serg on 28.04.2016.
 */
public interface Storage {
    void add (Product product);
    boolean appropriate(Product product);
}
