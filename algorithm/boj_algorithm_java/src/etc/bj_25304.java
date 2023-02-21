package etc;

import java.util.Scanner;

public class bj_25304 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int num = scanner.nextInt();


        for (int i = 0; i < num; i++){

            int price = scanner.nextInt();
            int amount = scanner.nextInt();

            money -= (price*amount);
        }

        if(money == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }


}
