package ru.serg.Lesson1.Lesson1_5;

import org.apache.log4j.Logger;

/**
 * Created by Serg on 25.07.2016.
 */
public class Chat {
    private static final Logger log = Logger.getLogger(Chat.class);

    public void doOrder(){
        // какае-то логика
        System.out.println("Заказ оформлен!");
        // логируем инфо
        log.info("Это информационное сообщение!");
        addToCart();
    }

    private void addToCart() {
        // добавление товара в корзину
        System.out.println("Товар добавлен в корзину");
        // логируем ошибку
        log.error("Это сообщение ошибки");
    }

    public static void main(String[] args) {
        Chat chat = new Chat();
        chat.doOrder();
    }
}
