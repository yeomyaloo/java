//참조변수 super
public class super2 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 {int x = 10;} // super.x this.x 둘 다 가능 

class Child2 extends Parent2{

	void method() {
		System.out.println("x=" + x); //10 자신의 x가 없어서 x는 조상 멤버
		System.out.println("this.x=" + this.x); //10 조상멤버
		System.out.println("super.x=" + super.x); //10 조상멤버
	//x가 조상멤버에 하나밖에 없기 때문에 this와 super가 같은 곳을 가르킨다.
	
	}
}