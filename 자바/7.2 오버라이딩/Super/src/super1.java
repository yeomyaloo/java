//참조변수 super
public class super1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent {int x = 10;}

class Child extends Parent{
	int x = 20; //this.x 
	
	void method() {
		System.out.println("x=" + x); //20
		System.out.println("this.x=" + this.x); //20 자기 멤버
		System.out.println("super.x=" + super.x); //10 조상멤버
	}
}