package ru.serg.Lesson1.Lesson1_5;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.fest.assertions.api.Assertions.*;

import static org.junit.Assert.*;

/**
 * Created by Serg on 26.07.2016.
 */
public class SendMassageTest {
    private static SendMassage send;

    @BeforeClass
    public static void initialise(){
        send = new SendMassage();
    }

    @Test
    public void sendmassageTest() throws Exception {
        String mes = "Hello";
        String res = send.sendmassage();
        assertThat(res).isIn(mes);
    }

}