package javajungsuk;

abstract class Player{
	abstract void play(int pos);
	abstract void stop();
}


//추상클래스는 상속을 통해 완성해야 객체생성이 가능하기 때문에 상속을 통해서 구현을 먼저 해준다
class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos+"위치부터 play합니다.");
	}
	void stop() {System.out.println("재생을 멈춥니다.");}
}

public class PlayerTest {
	public static void main(String[] args) {
		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
	}

}
