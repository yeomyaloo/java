package com.fatjar.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Receive extends Thread{
    Socket socket;

    DataInputStream dataInputStream;

    public Receive(Socket socket) {
        this.socket = socket;

        try {
            dataInputStream = new DataInputStream(socket.getInputStream());

        } catch (IOException e) {

        }
    }

    @Override
    public void run() {
        while (dataInputStream != null){
            try{
                System.out.println(dataInputStream.read());
            } catch (IOException e) {

            }
        }
    }
}
