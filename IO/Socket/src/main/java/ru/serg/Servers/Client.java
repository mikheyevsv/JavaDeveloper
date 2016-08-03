package ru.serg.Servers;

import org.apache.log4j.Logger;
import ru.serg.Servers.Configure.ConfigLog;
import ru.serg.Servers.Configure.Resourses;
import ru.serg.Servers.Servers.Server;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import static ru.serg.Servers.Configure.Resourses.Log.LOG_PROPERTIES_FILE;

/**
 * Created by Serg on 29.07.2016.
 */
public class Client {
    private static final Logger log = Logger.getLogger(Server.class);
    private static final int PORT = Resourses.GlobalValues.PORT;
    private static final String IP_ADRESS = Resourses.GlobalValues.IP_ADRESS;
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

        Client client = new Client(PHRASE, CHATLOG);

            try {
            client.createClient();
            client.startProgram();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createClient(){

        try {
            Socket socket = new Socket(IP_ADRESS, PORT);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

            String userInput;
            while (true) {
                userInput = stdIn.readLine();
                    out.println(userInput);

                System.out.println("answer: " + in.readLine());
                out.flush();
            }

        }catch (UnknownHostException uhe){
            System.out.println("Don't know about host");
            log.error("no connect");
        }
        catch (IOException e){
            log.error("Connection to server is unavalable", e);

        }

    }

    public Client(String phrase, String log) {
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
}
