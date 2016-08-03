package ru.serg;

import org.apache.log4j.Logger;
import ru.serg.Configure.ConfigLog;

import static ru.serg.Configure.Resourses.Log.LOG_PROPERTIES_FILE;

/**
 * Created by Serg on 03.08.2016.
 */
public class SearchFiles {
    private static final Logger log = Logger.getLogger(SearchFiles.class);


    public static void main(String[] args) {
        ConfigLog configLog = new ConfigLog(LOG_PROPERTIES_FILE);
        configLog.init();
    }
}
