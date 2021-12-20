package javaStandard;

public class Outer2 {
	class InstanceInner{ }
	static class StaticInner { }
	
	void myMethod2() {
		class LocalInner{ }
	}
}
