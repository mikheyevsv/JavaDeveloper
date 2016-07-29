package ru.serg.Servers;

import org.apache.log4j.Logger;
import ru.serg.Servers.Configure.ConfigLog;
import ru.serg.Servers.Configure.Resourses;
import ru.serg.Servers.Servers.Server;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.CharBuffer;

import static ru.serg.Servers.Configure.Resourses.Log.LOG_PROPERTIES_FILE;

/**
 * Created by Serg on 29.07.2016.
 */
public class Client {
    private static final Logger log = Logger.getLogger(Server.class);
    private static final int PORT = Resourses.GlobalValues.PORT;
    private static final String IP_ADRESS = Resourses.GlobalValues.IP_ADRESS;


    public static void main(String[] args) {
        ConfigLog configLog = new ConfigLog(LOG_PROPERTIES_FILE);
        configLog.init();

        Client client = new Client();
        client.createClient();
    }

    public void createClient(){
        try {
            InetAddress address = InetAddress.getByName(IP_ADRESS);
            Socket socket = new Socket(address, PORT);

            OutputStream socketOut = socket.getOutputStream();
            InputStream socketIn = socket.getInputStream();

            PrintWriter printWriter = new PrintWriter(socketOut, true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socketIn));

            String st = null;
            while (true){
                System.out.println("Enter a phrase");
                st = reader.readLine();
                reader.read(CharBuffer.wrap(st));
                printWriter.write(st);
                log.info(" Massege is received");
                reader.close();
            }
        }catch (IOException e){
            log.error("Connection to server is unavalable", e);
        }
    }
}
