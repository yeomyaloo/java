package javaStandard;
class Outer5{
	int value = 10; // Outer5.this.value

	class Inner {
		int value = 20; //this.value
		
		void method1() {
			int value = 30;
			System.out.println("              value :" + value);
			System.out.println("         this.value :"+this.value);
			System.out.println("   Outer.this.value :"+ Outer5.this.value);
		}
	}//Inner클래스의 끝
}//Outer클래스의 끝


public class InnerEx5 {
	public static void main(String[] args) {
		Outer5 outer5 = new Outer5();
		Outer5.Inner inner = outer5.new Inner();
		inner.method1();
	}
}//InnerEx5  끝
