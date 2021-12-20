package javaStandard;

class Outer3 {
	class InstanceInner{
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}

public class InnerEx4 {

	public static void main(String[] args) {
		/* �ν��Ͻ� Ŭ������ �ν��Ͻ��� �����Ϸ���
		�ܺ� Ŭ������ �ν��Ͻ��� ���� �����ؾ� �Ѵ�. */
		Outer3 oc = new Outer3(); //�ܺ�Ŭ������ �ν���Ʈ ����
		Outer3.InstanceInner ii = oc.new InstanceInner(); //�ν��Ͻ� Ŭ������ �ν��Ͻ� ����
		
		System.out.println("ii.iv : "+ ii.iv);
		System.out.println("Outer.StaticInner.cv : "+Outer3.StaticInner.cv);
	
		//����ƽ ���� Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �ʾƵ� �ȴ�.
		Outer3.StaticInner si = new Outer3.StaticInner();
		System.out.println("si,iv : " + si.iv);
	}

}
