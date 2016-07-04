package ru.serg.defaultRealisation;

import ru.serg.produkts.Product;
import ru.serg.storage.Storage;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.jar.Pack200;

/**
 * Created by Serg on 28.04.2016.
 */
public class ControllQuality implements Control {
    private List<Storage>storages;

    public ControllQuality(List<Storage> storages) {
        this.storages = storages;
    }

    public ControllQuality(){}
//   public void sortProduct(Product product) {
//    if((getExpiry(product.getCreateDate(), product.getExpiryDate())) <= 0 ){
//        addStorage(product);
//        System.out.println("In Shop");
//
//       }else if ((getExpiry(product.getCreateDate(), product.getExpiryDate()) > 0 &&
//             (getExpiry(product.getCreateDate(), product.getExpiryDate()) < 25))){
//        addStorage(product);
//          System.out.println("In Shop and Discount");
//
//       }else if ((getExpiry(product.getCreateDate(), product.getExpiryDate()) > 25 &&
//             (getExpiry(product.getCreateDate(), product.getExpiryDate()) < 75))){
//        addStorage(product);
//            System.out.println("In Shop");
//       }else if ((getExpiry(product.getCreateDate(), product.getExpiryDate()) > 75)){
//        addStorage(product);
//            System.out.println("In Warehouse");
//        }
//    }

    public void addStorage(Product product) {
        for (Storage storage : this.storages) {
            if(storage.appropriate(product)) {
                storage.add(product);
                break;
            }
        }
    }

    public void print() {
        System.out.println();
    }

    public long getExpiry(GregorianCalendar dateCreate, GregorianCalendar dateExpiry){
        GregorianCalendar calendar = new GregorianCalendar();
        int y = calendar.get(Calendar.YEAR);
        int m = 1 + calendar.get(Calendar.MONTH);
        int d = calendar.get(Calendar.DATE);
        GregorianCalendar today = new GregorianCalendar(y, m, d);
        long result = (dateExpiry.getTimeInMillis() - today.getTimeInMillis())
                      * 100 / (dateExpiry.getTimeInMillis() - dateCreate.getTimeInMillis());
        if (result <= 0) {
            result  = 0;
        }
        return result;
    }
}
