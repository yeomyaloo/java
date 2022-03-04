package javajungsuk;

public class Java13_6 {

	public static void main(String[] args) {
		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();
		
		
		//쓰레드의 경우 기본 순위 5이고 쓰레기2는 7로 설정
		th2.setPriority(7);
		
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(-) : " + th2.getPriority());
		th1.start();
		th2.start();
	}

}


class ThreadEx6_1 extends Thread{
	public void run() {
		for(int i = 0 ; i < 300 ; i++) {
			System.out.print("-");
			for (int x = 0; x < 10000000; x++);//시간 지연용 for
		}
	}
}
class ThreadEx6_2 extends Thread{
	public void run() {
		for(int i = 0 ; i < 300 ; i++) {
			System.out.print("|");
			for (int x = 0; x < 10000000; x++);//시간 지연용 for
		}
	}
}
