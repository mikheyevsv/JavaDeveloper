package ru.serg.storage;

import ru.serg.defaultRealisation.ControllQuality;
import ru.serg.produkts.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serg on 26.04.2016.
 */
public class Trash implements Storage {
    private final String name;
    private List<Product> products;
    ControllQuality control = new ControllQuality();

    public Trash(String name) {
        this.name = name;
        this.products = new ArrayList<Product>();
    }

    public void add(Product product) {
        products.add(product);
    }


    public boolean appropriate(Product product) {
        boolean result = false;
                if((control.getExpiry(product.getCreateDate(), product.getExpiryDate())) <= 0 ){
            System.out.println("in Trash");
            result = true;
        }
        return result;
    }
}
