package javajungsuk;

//예외처리가 안 되어서 비정상적으로 종료가 됨.
public class Java8_4_2 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(args[0]);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) 
				System.out.println("True");
			System.out.println("ArithmeticException");
		}
		System.out.println(6);
	}
}
