package com.fatjar.test;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender extends Thread{

    Socket socket;
    DataOutputStream outputStream;

    String name;

    public Sender(Socket socket) {
        this.socket = socket;

        try {
            outputStream = new DataOutputStream(socket.getOutputStream());
            name = "[" + socket.getInetAddress()+" : " + socket.getPort()+"]";

        } catch (IOException e) {
        }
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while(outputStream!=null){
            try {
                outputStream.write(scanner.nextLine().getBytes());
            } catch (IOException e) {

            }
        }


    }
}