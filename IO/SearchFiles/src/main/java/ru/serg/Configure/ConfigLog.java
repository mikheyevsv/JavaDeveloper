package ru.serg.Configure;

import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Sergey Miheev
 * @version 1.0
 */
public class ConfigLog {
    private static Properties logProperties = new Properties();
    private static String logFile;

    @SuppressWarnings("statis-access")
    public ConfigLog(String logFile) {
        this.logFile = logFile;
    }

    public void init(){
        try {
            logProperties.load(new FileInputStream(logFile));
            PropertyConfigurator.configure(logProperties);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
