package ru.serg;


import ru.serg.defaultRealisation.ControllQuality;
import ru.serg.defaultRealisation.Food;
import ru.serg.produkts.Milk;
import ru.serg.produkts.Preserves;
import ru.serg.produkts.Product;
import ru.serg.produkts.Sausage;
import ru.serg.storage.*;

import java.util.*;

/**
 * Created by Serg on 28.04.2016.
 */
public class StartStock {
    Currency currrency = Currency.getInstance(new Locale("ru", "RU"));
    List<Storage> storage = new ArrayList<Storage>();
    private final ControllQuality control;
    public static void main(String[] args) {
        StartStock start = new StartStock();

    }
    public StartStock(){

        Product milk = new Milk(new Food("Home in the Vallage", new GregorianCalendar(2016, 3, 21),
                                new GregorianCalendar(2015, 3, 25),
                                currrency, 3.2, false));

        Product preserves = new Preserves(new Food("Vichi", new GregorianCalendar(2016, 2, 21),
                                new GregorianCalendar(2016, 10, 25),
                                currrency, 5.0, false));

        Product sausage = new Sausage(new Food("Childrens", new GregorianCalendar(2015, 12, 21),
                                new GregorianCalendar(2016, 4, 25),
                                currrency, 2.0, false));

        storage.add(new Shop("Shop"));
        storage.add(new Trash("Trash"));
        storage.add(new WareHouse("WareHouse"));
        storage.add(new WareHouseTwo("WareHouseTwo"));

        control = new ControllQuality(storage);

        control.addStorage(milk);
        control.addStorage(preserves);
        control.addStorage(sausage);
        control.print();
    }
}
