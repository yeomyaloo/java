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
		//���� --> �������� �ʴ� �κ��� ���Ѵ�.
	}
	void hook() {} //�⺻���� ���븸 �����Ǿ� �ְų� �ƹ� �ڵ嵵 ������� ���� �޼ҵ�
	
}