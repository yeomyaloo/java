package server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

    public static void main(String[] args) throws IOException {

        try{
            ServerSocket serverSocket = new ServerSocket(8888);

            Socket socket = serverSocket.accept();

            OutputStream outputStream = socket.getOutputStream();

            String sendDataString = "Welcome to My Server";
            outputStream.write(sendDataString.getBytes());

            serverSocket.close();
            socket.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
