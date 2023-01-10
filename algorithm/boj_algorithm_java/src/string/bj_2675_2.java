package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bj_2675_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < testCase; i++){
            String[] str = br.readLine().split(" ");
            int num = Integer.parseInt(str[0]);
            String s = str[1];
            for(int j = 0; j < s.length(); j++){
                for (int k = 0; k < num; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();

        }

    }
}
