package smu_2;

abstract class AbstractClass{
	final void templateMethod() {
		primitiveOperation1();
		primitiveOperation1();
		concreteOperation();
		hook();
	}
	
	abstract void primitiveOperation1();
	abstract void primitiveOperation2();
	void concreteOperation() {
		//구현 --> 위임하지 않는 부분을 말한다.
	}
	void hook() {} //기본적인 내용만 구현되어 있거나 아무 코드도 들어있지 않은 메소드
	
}