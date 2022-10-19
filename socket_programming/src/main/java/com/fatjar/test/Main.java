package com.fatjar.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args[0].equals("-l")){
            new Server(args[1]);
        }else {
            new Client(args[0], args[1]);
        }






        /**
         * if -blah blah : 요청에 맞게 진행
         *      -X -> method를 떼내서 해당 host뒤에 붙여준다.
         *      -v -> 요청, 응답 헤더를 같이 출력
         *         -> -H의 경우 커스텀 헤더를 추가로 전송
         *
         *
         * else: get 요청
         *
         *
         *
         * */




        /*if (args[0].equals("scurl")){
            if (args[1].equals("-v")){
                URL url = new URL("http://0v");
                HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
                httpConn.setRequestMethod("GET");

                InputStream responseStream = httpConn.getResponseCode() / 100 == 2 ? httpConn.getInputStream() : httpConn.getErrorStream();
                Scanner s = new Scanner(responseStream).useDelimiter("\\A");
                String response = s.hasNext() ? s.next() : "";
                System.out.println(response);
            }
        }*/




    }
}

