package ru.serg.maket;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Serg on 30.05.2016.
 */
public class TrackerTest {

    @Test
    public void whenApplicationAddedToParametersNeedChanged() {
    Tracker tracker = new Tracker();

    Item res = tracker.addItem(new Item());

    assertNotNull(res);
    }



    @Test
    public void testDeleteItem() {

        Tracker tracker = new Tracker();


    }
    @Test
    public void testEditItem() {

    }

}