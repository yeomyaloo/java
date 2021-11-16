package javajungsuk;
//같은 클래스 내에 public 클래스는 한 번만 쓸 수 있다. 

public class MyParent {//접근 제어자 public
	private int prv; //같은 클래스
			int dft; //같은 패키지 default
	protected int prt; // 같은 패키지 + 자손(다른패키지)
	public int pub; //접근제한 X
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest{ //접근 제어자 (default)
	public static void main(String[] args) {
			MyParent p = new MyParent();
			//System.out.println(p.prv); //에러 접근범위 안 맞음
			System.out.println(p.dft);
			System.out.println(p.prt);
			System.out.println(p.pub);

	}

}
	

