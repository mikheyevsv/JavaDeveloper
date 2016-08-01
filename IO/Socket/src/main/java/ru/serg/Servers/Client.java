package ru.serg.Servers;

import org.apache.log4j.Logger;
import ru.serg.Servers.Configure.ConfigLog;
import ru.serg.Servers.Configure.Resourses;
import ru.serg.Servers.Servers.Server;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
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
            Socket socket = new Socket(IP_ADRESS, PORT);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println("echo: " + in.readLine());
                in.close();
                out.close();
                stdIn.close();
            }
        }catch (UnknownHostException uhe){
            System.out.println("Don't know about host");
            log.error("no connect");
        }
        catch (IOException e){
            log.error("Connection to server is unavalable", e);
        }
    }
}
