package javajungsuk;

abstract class Player{
	abstract void play(int pos);
	abstract void stop();
}


//추상클래스는 상속을 통해 완성해야 객체생성이 가능하기 때문에 상속을 통해서 구현을 먼저 해준다
abstract class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos+"위치부터 play합니다.");
	}
	

public class PlayerTest2 {
	public static void main(String[] args) {
		
		/*위의 구현부가 완전하게 구현하지 않아서 - > 조상 클래스 안에 있는 메소드를 모두 구현하지 않음
		 아래 객체 생성이 불가함 이렇게 사용하면 에러가 난다.	*/		
		Player ap = new AudioPlayer(); //다형성 실제 가리키고 있는 것은 AudioPlayer
		ap.play(100);
		ap.stop();
	}
}
