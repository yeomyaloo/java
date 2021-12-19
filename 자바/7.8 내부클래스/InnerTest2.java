package javaStandard;
class AAA{
	int i = 100;
	BBB b = new BBB(); // A 클래스에서 B을 사용하기 위해서	
}

class BBB{
	void method() {
		AAA a = new AAA(); //B 클래스 내에서 A의 멤버에 접근하기 위해서 
		System.out.println(a.i);
		}
}

class CCC{
	BBB b = new BBB();
}

public class InnerTest2{
	public static void main(String[] args) {
		BBB b = new BBB();
		b.method();
	}
}