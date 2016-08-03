package ru.serg;

import org.apache.log4j.Logger;
import ru.serg.Configure.ConfigLog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ru.serg.Configure.Resourses.Log.LOG_PROPERTIES_FILE;

/**
 * Created by Serg on 03.08.2016.
 */
public class SearchFiles {
    private static final Logger log = Logger.getLogger(SearchFiles.class);
    private Pattern pattern;
    private Matcher matcher;

    public static void main(String[] args) {
        ConfigLog configLog = new ConfigLog(LOG_PROPERTIES_FILE);
        configLog.init();

    }

    public void searchPattern(){
        pattern = Pattern.compile("");
        matcher = pattern.matcher(pattern);
    }
}
