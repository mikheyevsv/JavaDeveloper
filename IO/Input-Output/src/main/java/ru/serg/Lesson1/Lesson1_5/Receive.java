package ru.serg.Lesson1.Lesson1_5;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg on 27.07.2016.
 */
public class Receive {
    private static final Logger log = Logger.getLogger(Receive.class);
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String read() {
        System.out.println("Enter a massage.");
        try {
            return br.readLine();
        } catch (IOException e) {
            log.error("Something failed", e);
        }
        return "";
    }

    public void close(){
        try {
            br.close();
        } catch (IOException e) {
            log.error("Something failed", e);
        }log.info("Stream is closeg");
    }
}
