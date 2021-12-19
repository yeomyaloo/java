package javaStandard;


//다중상속을 허용하는 interface
interface Fightable extends Movable, Attackable{ }


//인터페이스의 조상은 인터페이스만 가능하기 때문에 extend 쓰지 않아도 됨.생략가능
interface Movable{
	//지정된 위치로 이동하는 기능의 메서드
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit u);
}