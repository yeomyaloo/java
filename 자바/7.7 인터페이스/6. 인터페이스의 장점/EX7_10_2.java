package javaStandard;

public class EX7_10_2 {
	public static void main(String[] args) {
		
		//Unit Ÿ���� �������� group
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
	void stop() {/*���� ��ġ�� ����*/}
}

class Marine2 extends Unit2{ //����
	void move(int x, int y) {
		System.out.println("Marine[x="+ x +",y= "+ y +"]");
	}
	void stimPack() {}
}
class Tank2 extends Unit2{ //��ũ
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
