package javaStandard;

public class Java13_8 {
	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		
		th1.start();
		th2.start();
		
		
		
		System.out.print("<<main 종료>>");
		
	}
	
	static void delay(long millis) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
	}
}



class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i = 0 ; i < 300 ; i ++)
			System.out.print("-");
		System.out.print("<<th1 종료>>");
	}
}
class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i = 0 ; i < 300 ; i ++)
			System.out.print("|");
		System.out.print("<<th2 종료>>");
	}
}


