package javajungsuk;

abstract class Player{
	//꼭 필요하지만 자손마다 다르게 구현될 경우 추상 메서드를 만들어 준다. 
	abstract void play(int pos); //추상 메서드 몸통이 없는 미완성 메서드
	abstract void stop(); //추상 메서드

}

class AudioPlayer extends Player{
	void play(int pos) {/*내용 생략*/} //추상메서드를 구현한 부분
	void stop() {/*내용 생략*/} //추상메서드를 구현
}
abstract class AbstractPlayer extends Player{
//상속을 받아서 1개만 구현한 경우여서 abstract를 붙여주어야 한다. 
	void play(int pos) {/*내용 생략*/} //추상메서드 구현
}
