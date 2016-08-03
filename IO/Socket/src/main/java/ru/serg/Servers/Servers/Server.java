package ru.serg.Servers.Servers;

import org.apache.log4j.Logger;
import ru.serg.Servers.Configure.ConfigLog;
import ru.serg.Servers.Configure.Resourses;
import ru.serg.Servers.Receive;
import ru.serg.Servers.Send;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


import static ru.serg.Servers.Configure.Resourses.Log.LOG_PROPERTIES_FILE;

/**
 * Created by Serg on 28.07.2016.
 */
public class Server {
    private static final Logger log = Logger.getLogger(Server.class);
    private static final int PORT = Resourses.GlobalValues.PORT;
    private static final String STOP = Resourses.GlobalValues.STOP;
    private static final String END = Resourses.GlobalValues.END;
    private static final String CONTINUE = Resourses.GlobalValues.CONTINUE;
    private static  String PHRASE = Resourses.GlobalValues.PHRASE;
    private static  String CHATLOG = Resourses.GlobalValues.CHATLOG;
    private Receive receive;
    private Send send;
    private boolean stop;
    private boolean stopChat;

    public static void main(String[] args) {
        ConfigLog configLog = new ConfigLog(LOG_PROPERTIES_FILE);
        configLog.init();
        Server server = new Server();

        try {server.createSocket();
            server.startProgram();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createSocket() {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("I expect a response from the server");

            Socket clientSocket = serverSocket.accept();
            log.warn("the connection is  not established");
            System.out.println("the connection is established");

            PrintWriter out =
                    new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));

            String inputLine;
            while (true) {
                inputLine = in.readLine();
                out.println(inputLine);
                out.flush();
            }

        } catch (IOException e) {
            log.error("Chto-to poshlo ne tak", e);

        }
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
}