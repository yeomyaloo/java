package javajungsuk;

abstract class Player{
	
	//iv(인스턴스변수)
	boolean pause; //변수들
	int currentPos;
	
	//생성자
	Player(){ //추상클래스도 생성자가 있어야 한다. 
		pause = false;
		currentPos = 0;
	}
	
	
	//추상 메서드
	abstract void play(int pos);
	abstract void stop(); //몸통이({}) 없어야 한다. 
	
	
	//인스턴스 메서드
	void play() {
		play(currentPos); //추상메서드를 사용할 수 있다.(호출 선언부만 알면 호출가능)
	}
}