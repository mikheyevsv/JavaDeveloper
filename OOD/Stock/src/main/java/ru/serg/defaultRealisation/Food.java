package ru.serg.defaultRealisation;

import ru.serg.produkts.Product;

import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;

/**
 * Created by Serg on 26.04.2016.
 */
public class Food implements Product {

    private String name;
    private GregorianCalendar expiryDate;
    private GregorianCalendar createDate;
    private Currency price;
    private double disscount;
    private boolean reproduct;

    public Food(String name, GregorianCalendar expiryDate, GregorianCalendar createDate, Currency price, double disscount, boolean reproduct) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.createDate = createDate;
        this.price = price;
        this.disscount = disscount;
        this.reproduct = reproduct;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name() {
        return null;
    }

    public GregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(GregorianCalendar expiryDate) {
        this.expiryDate = expiryDate;
    }

    public GregorianCalendar getCreateDate() {
        return createDate;
    }

    public void setCreateDate(GregorianCalendar createDate) {
        this.createDate = createDate;
    }

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }

    public void setDiscount(double discount) {

    }

    public double getDisscount() {
        return disscount;
    }

    public void setDisscount(double disscount) {
        this.disscount = disscount;
    }

    public boolean isReproduct() {
        return reproduct;
    }

    public void setReproduct(boolean reproduct) {
        this.reproduct = reproduct;
    }

}
