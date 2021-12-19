package javaStandard;

public class EX7_10_2 {
	public static void main(String[] args) {
		
		//Unit 타입의 참조변수 group
		Unit2[] group = new Unit2[3];
		group[0] = new Marine2();
		group[1] = new Tank2();
		group[2] = new Dropship2();
		
		
		group[0].move(100,200);
		group[1].move(100,200);
		group[2].move(100,200);
	}
}

abstract class Unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() {/*현재 위치에 정지*/}
}

class Marine2 extends Unit2{ //보병
	void move(int x, int y) {
		System.out.println("Marine[x="+ x +",y= "+ y +"]");
	}
	void stimPack() {}
}
class Tank2 extends Unit2{ //탱크
	void move(int x, int y) {
		System.out.println("Tank[x="+ x +",y= "+ y +"]");
	}
	void changeMode() {}
}
class Dropship2 extends Unit2{ //
	void move(int x, int y) {
		System.out.println("Dropship[x="+ x +",y= "+ y +"]");
	}
	void stimPack() {}
}
