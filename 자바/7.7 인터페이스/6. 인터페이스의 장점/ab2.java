package javajungsuk;

class A{
	public void methodA(I i) {
		i.methodB();
	}
}

interface I { void methodB(); }

class B implements I{
	public void methodB() {
		System.out.println("methodB()");
	}
}