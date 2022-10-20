package com.java.httpclient;
import com.beust.jcommander.JCommander;


public class Parameter {


    public static final String HELP = "-help";
    @com.beust.jcommander.Parameter(names = {HELP, "-Help"}, description = "help method", help = true)
    public boolean help;

    public boolean isHelp() {
        return help;
    }


    /**
     * 2번
     * */
    public static final String  METHOD = "-X";
    @com.beust.jcommander.Parameter(names = {METHOD, "-x"}, description = "get or post ..", required = false)
    public String method;

    public String getMethod() {
        return method;
    }


    /**
     * 3번 -v 요청, 응답헤더 가져오기
     * */

    @com.beust.jcommander.Parameter(names = {"-v", "-V"}, description = "-v command operator", required = false)
    public boolean vCmd = true;

    public boolean getvCmd() {
        return vCmd;
    }


    /**
     * 4번
     * */
    @com.beust.jcommander.Parameter(names = {"-H", "-h"}, description ="-H command operator" ,required = false)
    public String hCmd;

    public String gethCmd() {
        return hCmd;
    }


    /**
     * 5번
     * */
    @com.beust.jcommander.Parameter(names = {"-d", "-D"}, description = "-d command operatoe", required = false, arity = 1)
    public String dCmd;

    public String getdCmd() {
        return dCmd;
    }



    /**
     * 6번 302 응답을 받고 응답에 지정된 Location으로
     * */
    @com.beust.jcommander.Parameter(names = {"-L", "-l"}, description = "-l command operator", required = false)
    public boolean lCmd;

    public boolean islCmd() {
        return lCmd;
    }

    /** URL
     * host은 들어오는 모든 값들..?
     * */
    @com.beust.jcommander.Parameter(description = "---host url---", required = true)
    public String host;

    public String getHost() {
        return host;
    }


}
