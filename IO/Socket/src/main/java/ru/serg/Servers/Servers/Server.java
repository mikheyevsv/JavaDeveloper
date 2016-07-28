package ru.serg.Servers.Servers;

import org.apache.log4j.Logger;
import ru.serg.Servers.Configure.ConfigLog;
import ru.serg.Servers.Configure.Resourses;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static ru.serg.Servers.Configure.Resourses.Log.LOG_PROPERTIES_FILE;

/**
 * Created by Serg on 28.07.2016.
 */
public class Server {
    private static final Logger log = Logger.getLogger(Server.class);
    private static final int PORT = Resourses.GlobalValues.PORT;

    public static void main(String[] args) {
        ConfigLog configLog = new ConfigLog(LOG_PROPERTIES_FILE);
        configLog.init();
    }

    public void createSocket(){
        try{
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("I expect a response from the server");

            Socket socket = serverSocket.accept();
            log.warn("the connection is  not established");
            System.out.println("the connection is established");

        }catch (IOException ie){
            log.error("Chto-to poshlo ne tak", ie);
        }
    }
}
