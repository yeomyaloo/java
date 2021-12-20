package javaStandard;

public class InnerEx2 {
	class InstanceInner {}
	static class StaticInner {}
	
	//�ν��Ͻ� ��� ������ ���� ���� ������ ����
	InstanceInner iv = new InstanceInner();
	//����ƽ ��� ������ ���� ���� ������ ����
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//����ƽ����� �ν��Ͻ� ����� ������ �� ����. 
//		InstanceInner obj1 = new InstanceInner(); ����!!
		StaticInner obj2 = new StaticInner();	
		
		// ���� ����ƽ ������� �ν��Ͻ� ����� ������ �Ϸ��� �Ʒ��� ���� �ؾ� �Ѵ�.
		InnerEx2 outer = new InnerEx2(); //�ν��Ͻ� Ŭ���� �ܺ� Ŭ������ ���� �����ؾ� �Ѵ�.
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethode() {
		//�ν��Ͻ��޼ҵ�� ����ƽ���, �ν��Ͻ���� ��� ���� ����.
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//�޼��� ���� ���������� ����� ���� Ŭ������ �ܺο��� ������ �� ����. 
//		LocalInner lv = new LocalInner();����!! --> ���� Ŭ����
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}
