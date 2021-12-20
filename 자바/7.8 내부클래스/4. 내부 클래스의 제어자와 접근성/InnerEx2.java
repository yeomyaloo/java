package javaStandard;

public class InnerEx2 {
	class InstanceInner {}
	static class StaticInner {}
	
	//인스턴스 멤버 간에는 서로 직접 접근이 가능
	InstanceInner iv = new InstanceInner();
	//스태틱 멤버 간에는 서로 직접 접근이 가능
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//스태틱멤버는 인스턴스 멤버에 접근할 수 없다. 
//		InstanceInner obj1 = new InstanceInner(); 에러!!
		StaticInner obj2 = new StaticInner();	
		
		// 굳이 스태틱 멤버에서 인스턴스 멤버에 접근을 하려면 아래와 같이 해야 한다.
		InnerEx2 outer = new InnerEx2(); //인스턴스 클래스 외부 클래스를 먼저 생성해야 한다.
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethode() {
		//인스턴스메소드는 스태틱멤버, 인스턴스멤버 모두 접근 가능.
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다. 
//		LocalInner lv = new LocalInner();에러!! --> 지역 클래스
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}
