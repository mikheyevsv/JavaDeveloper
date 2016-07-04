package ru.serg.produkts;

import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;

/**
 * Created by Serg on 29.04.2016.
 */
public interface Product {

    String getName();
    GregorianCalendar getExpiryDate();
    GregorianCalendar getCreateDate();
    Currency getPrice();
    double getDisscount();
    boolean isReproduct();

    void setCreateDate(GregorianCalendar date);
    void setExpiryDate(GregorianCalendar date);
    void setPrice(Currency price);
    void setDiscount(double discount);
    void setReproduct(boolean isReproduct);

}
