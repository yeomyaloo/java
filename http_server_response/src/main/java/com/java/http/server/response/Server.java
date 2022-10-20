package com.java.http.server.response;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        int port;
        ServerSocket serverSocket;
        Socket socket;
        BufferedReader input;

        try{

            //해당 main의 cmd 모드로 실행해서 0번째 인덱스에 들어온 인자를 port로 취급..
            //shttp port... (cmd 명령어)
            port = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("given default port");
            port = 3000;
        }


        try{
            socket = serverSocket.accept();
        } catch (IOException e) {

        }

    }




}
