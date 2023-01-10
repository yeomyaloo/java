package string;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class bj_2675 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++){

            int num = scanner.nextInt();
            String str = scanner.next();


            for (int j=0; j < str.length(); j++){
                for (int k = 0; k < num; k++){
                    System.out.print(str.charAt(j));
                }
            }

            System.out.println();

        }

    }
}
