package javaStandard;

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv; // 외부 클래스의 private 멤버도 접근이 가능
		int iiv2 = outerCv;
	}
	static class StaticInner{
		// 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
//		int siv = outerIv; 에러!!
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;//JDK1.8부터 final 생략 가능
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			//외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근이 가능다.
			int liv3 = lv; //JDK1.8부터는 에러가 아님 원래는 에러임 
			int liv4 = LV;
		}
	}
	
}
