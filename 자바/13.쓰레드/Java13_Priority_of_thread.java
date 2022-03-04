package javajungsuk;

public class Java13_Priority_of_thread {
	void setPriority(int newPriority); //쓰레드의 우선순위를 지정한 값으로 변경한다.
	int getPriority();
	
	public static final int MAX_PRIORITY = 10; //최대 우선순위
	public static final int MIN_PRIORITY = 1; //최소 우선순위
	public static final int NORM_PRIORITY = 5; //보통 우선 순위
	
}
