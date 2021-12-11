package javajungsuk;

abstract class Player{
	abstract void play(int pos); //추상 메서드 몸통이 없는 미완성 메서드
	abstract void stop(); //추상 메서드
	
	//Player p = new Player(); 추상 클래스의 인스턴스 생성 불가

}

//추상클래스를 상속해서 추상 메서드를 완성해야 인스턴스 생성이 가능

class AudioPlayer extends Player{
	void play(int pos) {/*내용 생략*/} //추상메서드를 구현한 부분
	void stop() {/*내용 생략*/} //추상메서드를 구현
	
	AudioPlayer ap = new AudioPlayer(); // OK
}

