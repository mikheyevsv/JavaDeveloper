package ru.serg.Servers;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


/**
 * Created by Serg on 27.07.2016.
 */
public class Send {
    private static final Logger log = Logger.getLogger(Send.class);

    private String fileName;
    private String[] text;
    private int count;
    private Random random;

    public Send (String fileName){
        this.fileName = fileName;
        random = new Random();
    }

    public String generator() {
        count = random.nextInt(text.length - 1);
        System.out.println(text[count]);
        return text[count];
    }

    public void fill() throws IOException {
        FileReader stream = new FileReader(new File(fileName));
        int readByte;
        StringBuffer stringBuffer = new StringBuffer();
        while (stream.ready()){
            readByte = stream.read();
            stringBuffer.append((char) readByte);
            log.info("Massage added");
        }
        this.text = stringBuffer.toString().split("\n");
        try {
            stream.close();
        }catch (IOException e) {
            log.error("Stream not closed",e);
        }
    }

}
