package ru.serg.produkts;

import java.util.Currency;
import java.util.GregorianCalendar;

/**
 * Created by Serg on 28.04.2016.
 */
public class Sausage implements Product {
    private final Product product;

    public Sausage(Product sausage) {
        this.product = sausage;
    }

    public String getName() {
        return product.getName();
    }

    public GregorianCalendar getExpiryDate() {
        return product.getExpiryDate();
    }

    public GregorianCalendar getCreateDate() {
        return product.getCreateDate();
    }

    public Currency getPrice() {
        return product.getPrice();
    }

    public double getDisscount() {
        return product.getDisscount();
    }

    public boolean isReproduct() {
        return product.isReproduct();
    }

    public void setCreateDate(GregorianCalendar date) {
        product.setCreateDate(date);
    }

    public void setExpiryDate(GregorianCalendar date) {
        product.setExpiryDate(date);
    }

    public void setPrice(Currency price) {
        product.setPrice(price);
    }

    public void setDiscount(double discount) {
        product.setDiscount(discount);
    }

    public void setReproduct(boolean isReproduct) {
        product.setReproduct(isReproduct);
    }

}
