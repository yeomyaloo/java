package com.java.httpclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.http.HttpRequest;
import java.nio.Buffer;
import jdk.swing.interop.SwingInterOpUtils;

public class Client {


    public void ex1(String targetUrl) throws IOException {

        URL url = new URL(targetUrl);
        String host = url.getHost();


        Socket socket = new Socket(host, 80);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream printStream = new PrintStream(socket.getOutputStream());

        printStream.println("GET / HTTP/1.1 200 OK");
        printStream.println("Host: "+ url.getHost());
        printStream.println("Accept: */*");


        printStream.println("");
        printStream.flush();

        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        bufferedReader.close();
        printStream.close();
    }


    public void ex2(String targetUrl, String methodName) throws IOException {

        URL url = new URL(targetUrl);
        String host = url.getHost();
        Socket socket = new Socket(host, 80);


        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream ps = new PrintStream(socket.getOutputStream());


        if(methodName == "POST"){

        } else {
            ps.println("GET /get HTTP/1.1 200 OK");
        }





    }


}

