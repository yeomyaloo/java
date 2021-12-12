package javajungsuk;
abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다.");
	}
}
interface Fightable{ //인터페이스의 모든 메서드는 예외 없이 public abstract.
	void move(int x, int y); // public abstract 생략됨
	void attack(Fightable f);// public abstract 생략됨
}

class Fighter extends Unit implements Fightable {
	
	//오버라이딩 규칙: 조상(public)보다 접근제어자가 좁으면 안 된다. 
	public void move(int x, int y) { //public을 붙이지 않으면 default로 범위가 조상보다 좁아서 오류 난다!!!
		System.out.println("["+x+", "+y+ "]로 이동");
	}
	public void attack(Fightable f){
		System.out.println(f+"를 공격");
	}
	Fightable getFightable() {
		Fighter f = new Fighter(); //Fighter를 생성해서 반환
		return f; //return (Fightable)f; 형변환이 생략됨
	}
	
}


public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();//반환타입이 일치해야 한다. 
		
	}

}
