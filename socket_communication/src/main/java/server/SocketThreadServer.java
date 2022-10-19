package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import org.apache.log4j.Logger;
public class SocketThreadServer extends Thread{

    private static final Logger logger = Logger.getLogger(SocketThreadServer.class);
    private Socket socket;

    public SocketThreadServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {

            String connectionIP = socket.getInetAddress().getHostAddress();
            System.out.println(connectionIP + "에서 연결을 시도했습니다.");

            br = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream());

            System.out.println(br.readLine());

            pw.println("정상적으로 수신되었습니다.");
            pw.flush();

        } catch (IOException e) {
            logger.error(e);
        } finally {
            try{
                if(pw != null)
                    pw.close();
                if(br != null)
                    br.close();
                if(socket != null)
                    socket.close();
            } catch (IOException e) {
                logger.error(e);
            }
        }
    }
}
