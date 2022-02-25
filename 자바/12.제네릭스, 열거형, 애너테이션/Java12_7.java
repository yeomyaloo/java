package javajungsuk;

class Parent {
	void parentMethod() {}
}

class Child extends Parent{
	@Override
	@Deprecated
	void parentMethod() {} // 조상 메서드의 이름을 잘못적음
}

@FunctionalInterface
interface Testable{
	void test();
	//void check();
}




class Java12_7{
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod();//
	}
}