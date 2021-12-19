package javaStandard;
class AAA{ //AAA는 BBB클래스의 외부 클래스
	int i = 100;
	BBB b = new BBB(); // A 클래스에서 B을 사용하기 위해서	
	
	class BBB{ //BBB는 AAA 클래스의 내부 클래스
		void method() {
			System.out.println(i); // 객체 생성 없이 외부 클래스의 멤버 접근 가능
			}
	}
}


public class InnerTest{
	public static void main(String[] args) {
		/*BBB 클래스는 더이상 독립적인 클래스가 아니기 때문에
		  먼저 AAA클래스 객체를 생성한 뒤 사용해야 한다.
		  BBB 클래스는 AAA 클래스의 멤버처럼 다루어지게 된다!!*/
	}
}