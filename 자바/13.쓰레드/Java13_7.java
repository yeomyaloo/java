package javajungsuk;

public class Java13_7 implements Runnable{
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		/*Runnable 인터페이스 구현으로 쓰레드를 사용하는데 
		* 이때 우리는 run()함수를 구현한 객체를 돌려주는 방식을 사용했다.
		*/
		Thread t = new Thread(new Java13_7()); //Thread(Runnable r)
		t.setDaemon(true); // start()보다 먼저 사용!!! 이부분이 없으면 종료 X
		t.start();
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5) autoSave = true;
		}
		System.out.println("프로그램을 종료합니다.");
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);//3초마
			} catch (InterruptedException e) {}
			
			if(autoSave) autoSave();
		
		}
	}
	
	public void autoSave() {
		System.out.println("작업 파일이 자동저장되었습니다.");
	}
}
