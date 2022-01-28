package javajungsuk;

import java.util.Scanner;

public class Java11_3_2 {

	private static final String MAX_SIZE = 100;

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while (true) {
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				if("".equals(input)) continue;
				
				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다. ");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE+"개 보여줍니다.");
				}else if (input.equalsIgnoreCase("history")) {
					save(input)
				}
			}
		}
		
	}

}
