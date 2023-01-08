package string;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class boj_11720 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String strings = sc.next();


        int result = 0;
        for (int i = 0; i<num; i++){
            result += strings.charAt(i) - '0';
        }
        System.out.println(result);
    }
}
