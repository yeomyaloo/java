package com.java.httpclient;

import java.io.IOException;

public class Main {

    static Client client;
    public static void main(String[] args) throws IOException {
        String url = "http://httpbin.org/get";
        if (args[1].equals(url)){
            client = new Client();
            client.ex1(url);
        } else if (args[1].equals("-X")){
            if(args[2].equals("POST")){
                client = new Client();
                client.ex2(url,"POST");
            } else {
              client = new Client();
              client.ex1(url);
            }
        }
    }
}
