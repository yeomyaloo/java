package etc;

import java.util.Arrays;
import java.util.Scanner;

public class bj_5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[31];
        Arrays.fill(arr, 0);

        for (int i = 1; i < 29; i++){
            int num = scanner.nextInt();
            arr[num] = num;
        }

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
