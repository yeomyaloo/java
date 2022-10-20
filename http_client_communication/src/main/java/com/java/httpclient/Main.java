package com.java.httpclient;
import com.beust.jcommander.JCommander;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;

import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main {
    public static void main(String[] args) throws IOException {

        /**
         * [ Jcommander 사용 (step 1) ]
         * 1. 우리가 Jcommander를 사용한 클래스의 경우엔 인자
         * 2. Jcommander에 들어가는 인자를 사용해서 parse 작업을 진행
         * [ JCommander 객체 생성 (step 2) ]
         * JCommander으로 url + method + operator 정보를 가져온다.
         * */

        Parameter parameter = new Parameter();
        JCommander cmd = new JCommander(parameter);

        /**
         * ↓ 해당 작업을 진행하는 이유
         * 잘못된 인자를 받았는지 확인하기 위해서 아래 try catch 작업을 진행..
         * */
        try {
            cmd.parse(args);
            if (parameter.isHelp()) {
                cmd.usage();
                return;
            }
        } catch (Exception e) {
            cmd.getConsole().println(e.toString());
            cmd.usage();
        }

        //기본 값으로 GET 설정하고 만약 다른 method가 발견되면 해당 메소드로 변경
        String method = "GET";
        if (parameter.getMethod() != null) {
            method = parameter.getMethod();
        }

        /**
         * 1번
         * */

        URL url = new URL(parameter.getHost());
        String host = url.getHost();

        Socket socket = new Socket(host, 80);
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(socket.getInputStream()));
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        StringBuilder sb = new StringBuilder();

        sb.append(method + " " + url.getPath() + " HTTP/1.1 \n");
        sb.append("Host: " + host + ":" + url.getDefaultPort()+ "\n");

        sb.append("Connection: close\n");
        sb.append("Accept: */*\n");


        /**
         * 4번
         * */
        if(!(parameter.getvCmd())){
            if(parameter.gethCmd() != null){
                sb.append(parameter.gethCmd()+"\n");
                System.out.println(sb.toString());
            } else {
                System.out.println(sb.toString());
            }
        }


     /*   *
         * 5번
         * json과 같은 데이터를 넘겨주게 될 때 head부분에 해당 데이터의 길이랑 같은 데이터를 전달해준다
         * content-length : ~ 해당 넘겨주는 데이터만큼의 길이를 넘겨주게 되면 해당 데이터를 그대로 가져가준다...  header 부분에 content-Length를 추가하는 방식으로 진행
         * */

        if (!(parameter.getvCmd())){
            //h
            if((parameter.gethCmd() != null)){
                sb.append(parameter.gethCmd()+"\n");
                // post and -d 일 때,
            } else if ((parameter.getMethod().equals("POST")) && (parameter.getdCmd() != null)){
                String length = String.valueOf(parameter.getdCmd().length());
                System.out.println(length);
                sb.append("Content-Length: "+ length+"\n");
            }

        }

        if(!parameter.islCmd()){

            URL url1 = new URL(parameter.getHost());
            System.out.println(url1.getHost()+ url1.getPath());

            url1.
        }


        printStream.println(sb.toString());
        printStream.println("");


        printStream.flush();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
        printStream.close();

    }


}
