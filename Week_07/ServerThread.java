package com.batson_java_course_2021.Week_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket socket = null;

    public ServerThread(Socket s) {
        super();
        this.socket = s;
    }
    
    @Override
    public void run() {
        try (
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            out.println("Connected...");
            System.out.println("Connected...");
            String inputLine = null;
            String response = "";
            while ((inputLine = in.readLine()) != null) {
                // out.println(inputLine);
                if (inputLine.equals("GET")) {
                    response = handleGetRequest();
                } else {
                    response = handleGenericRequest();
                }
                out.println(response);
                System.out.println(inputLine);
            }
            System.out.println("Closed from client");
            socket.close();
        } catch (IOException ex) { 
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public String handleGetRequest() {
        System.out.println("received GET request");
        return "GET HANDLED";
    }

    public String handleGenericRequest() {
        System.out.println("received OTHER request");
        return "OTHER HANDLED";
    }
}