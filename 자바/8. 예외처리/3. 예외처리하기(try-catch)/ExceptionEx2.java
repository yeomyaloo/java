package javajungsuk;

public class ExceptionEx2 {
	public static void main(String arge[]) {
		int number =100;
		int result =0;
		
		for (int i=0; i < 10; i++) {
			result = number/(int)(Math.random()*10);//7번라인
			System.out.println(result);
		}
	}
}
