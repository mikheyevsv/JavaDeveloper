package ru.serg.Lesson1.Lesson1_5;

import org.apache.log4j.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg on 25.07.2016.
 */
public class Chat {

    private static final Logger log = Logger.getLogger(Chat.class);
    private static final String STOP = "stop";
    private static final String END = "end";
    private static final String CONTINUE = "continue";
    private static final String PHRASE = "D:\\JavaDeveloper\\IO\\Input-Output\\src\\main\\resources\\phrase.txt";
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    private void close(){
        try {
            br.close();
        } catch (IOException e) {
            log.error("Something failed", e);
        }log.info("Stream is closeg");
    }

    public static void main(String[] args) {
        Chat cat = new Chat();
        cat.close();
    }
}
