package ru.serg.Lesson1.Lesson1_5;

import org.apache.log4j.Logger;
import ru.serg.Lesson1.Lesson1_5.Configure.ConfigLog;
import ru.serg.Lesson1.Lesson1_5.Configure.Resourses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg on 25.07.2016.
 */
public class Chat {

    private static final Logger log = Logger.getLogger(Chat.class);
    private static final String LOG_PROPERTIES_FILE = Resourses.Log.LOG_PROPERTIES_FILE;
    private static final String STOP = Resourses.GlobalValues.STOP;
    private static final String END = Resourses.GlobalValues.END;
    private static final String CONTINUE = Resourses.GlobalValues.CONTINUE;
    private static final String PHRASE = Resourses.GlobalValues.PHRASE;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    private void close(){
        try {
            br.close();
        } catch (IOException e) {
            log.error("Something failed", e);
        }log.info("Stream is closeg");
    }

    public static void main(String[] args) {
        ConfigLog configLog = new ConfigLog(LOG_PROPERTIES_FILE);
        configLog.init();
        Chat cat = new Chat();
        cat.close();
    }
}
