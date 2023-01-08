package string;

import java.util.Arrays;
import java.util.Scanner;

public class boj_10809 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        String s = scanner.nextLine();

        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        //System.out.println(Arrays.toString(arr));


        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}
