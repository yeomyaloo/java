package client;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class MainClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.0.2", 8888);

            InputStream inputStream = socket.getInputStream();

            byte[] receiveBuffer = new byte[100];
            inputStream.read(receiveBuffer);

            System.out.println(new String(receiveBuffer));

        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
