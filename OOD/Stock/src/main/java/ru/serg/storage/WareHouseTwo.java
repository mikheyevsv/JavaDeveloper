package ru.serg.storage;

import ru.serg.defaultRealisation.ControllQuality;
import ru.serg.produkts.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serg on 11.05.2016.
 */
public class WareHouseTwo implements Storage {
    private final String name;
    private final List<Product> products;
    ControllQuality control = new ControllQuality();

    public WareHouseTwo(String name) {
        this.name = name;
        this.products = new ArrayList<Product>();
    }
    public void add(Product product) {
       products.add(product);
    }

    public boolean appropriate(Product product) {
        boolean result = false;
        if((control.getExpiry(product.getCreateDate(), product.getExpiryDate()) > 75)){
            System.out.println("in WareTwo");
            result = true;
        }
        return result;
    }
}
