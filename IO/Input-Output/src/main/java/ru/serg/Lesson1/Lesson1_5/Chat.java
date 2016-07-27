package ru.serg.Lesson1.Lesson1_5;

import org.apache.log4j.Logger;
import ru.serg.Lesson1.Lesson1_5.Configure.ConfigLog;
import ru.serg.Lesson1.Lesson1_5.Configure.Receive;
import ru.serg.Lesson1.Lesson1_5.Configure.Resourses;

import java.io.*;

/**
 * Created by Serg on 25.07.2016.
 */
public class Chat {

    private static final Logger log = Logger.getLogger(Chat.class);
    private static final String LOG_PROPERTIES_FILE = Resourses.Log.LOG_PROPERTIES_FILE;
    private static final String STOP = Resourses.GlobalValues.STOP;
    private static final String END = Resourses.GlobalValues.END;
    private static final String CONTINUE = Resourses.GlobalValues.CONTINUE;
    private static  String PHRASE = Resourses.GlobalValues.PHRASE;
    private static  String CHATLOG = Resourses.GlobalValues.CHATLOG;
    private Receive receive;
    private Send send;
    private boolean stop;
    private boolean stopChat;



    public Chat(String phrase, String log) {
        this.receive = new Receive();
        this.send = new Send(PHRASE);
        this.stop = false;
        this.stopChat = false;
        CHATLOG = log;
        PHRASE = phrase;

    }

    public void startProgram() throws IOException {
        String message;
        FileWriter writer = new FileWriter(CHATLOG, true);
        FileOutputStream outputStream = new FileOutputStream(CHATLOG);
        send.fill();
        while (!stop){
            message = receive.read();
            outputStream.write(message.getBytes());
            writer.write(message + "\n");
            checkMassage(message);
            if (!stopChat){
                writer.write(send.generator());
            }
        }
        receive.close();
        outputStream.close();
        writer.flush();
        writer.close();
    }


    public void checkMassage(String massage){
        if(massage.equalsIgnoreCase(STOP)){
            this.stop = true;
        }else if (massage.equalsIgnoreCase(CONTINUE)){
            this.stop = false;
        }else if(massage.equalsIgnoreCase(END)){
            this.stop = true;
            this.stopChat = true;

        }
    }

    public static void main(String[] args) {
        ConfigLog configLog = new ConfigLog(LOG_PROPERTIES_FILE);
        configLog.init();
        Chat cat = new Chat(PHRASE, CHATLOG);
        try {
            cat.startProgram();
        } catch (IOException e) {
            log.error("The programm is not started", e);
        }

    }
}
