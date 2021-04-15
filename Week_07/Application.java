package com.batson_java_course_2021.Week_07;

import java.io.IOException;
import java.net.ServerSocket;

public class Application {
    private int port = 5000;
    private boolean listening = false;
    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }

    private void start() {
        listening = true;
        System.out.println("Starting...");
        try (ServerSocket sock = new ServerSocket(port)) {
            while (listening) {
                new ServerThread(sock.accept()).run();
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            System.exit(-1);
        }
    }
}