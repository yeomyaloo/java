package javaStandard;
class AAA{
	int i = 100;
	BBB b = new BBB(); // A Ŭ�������� B�� ����ϱ� ���ؼ�	
}

class BBB{
	void method() {
		AAA a = new AAA(); //B Ŭ���� ������ A�� ����� �����ϱ� ���ؼ� 
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