package javajungsuk;


class MyChild extends MyParent{ 
	public void printMembers() {
		//System.out.println(prv); //에러 같은 클래스 내에서만 사용 가능
		System.out.println(dft); //에러 같은 패키지 안에서만 사용하면 됨. 
		System.out.println(prt); //다른패키지지만 자손이라 OK
		System.out.println(pub); //OK
	}
}

public class MyParentTest2 {
	public static void main(String[] args) {
			MyParent p = new MyParent();
			//System.out.println(p.prv); //에러 접근범위 안 맞음
			System.out.println(p.dft);
			System.out.println(p.prt);
			System.out.println(p.pub);

	}

}
	

