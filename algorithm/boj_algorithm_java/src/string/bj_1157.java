package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1157 {

    public static void main(String[] args) throws IOException {
        int[] alpha = new int[26];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toUpperCase();

        for (int i = 0; i < s.length(); i++){
            int c = s.charAt(i)-'A';
            System.out.println(c);
            alpha[c] += 1;
        }

        int max = 0;
        char result = '?';

        for (int i = 0; i < alpha.length; i++){
            if(max < alpha[i]){
                max = alpha[i];
                result = (char) (i+'A');
            } else if (max == alpha[i]){
                result ='?';
            }

        }
        System.out.println(result);
    }
}
