package javaStandard;
class AAA{ //AAA�� BBBŬ������ �ܺ� Ŭ����
	int i = 100;
	BBB b = new BBB(); // A Ŭ�������� B�� ����ϱ� ���ؼ�	
	
	class BBB{ //BBB�� AAA Ŭ������ ���� Ŭ����
		void method() {
			System.out.println(i); // ��ü ���� ���� �ܺ� Ŭ������ ��� ���� ����
			}
	}
}


public class InnerTest{
	public static void main(String[] args) {
		/*BBB Ŭ������ ���̻� �������� Ŭ������ �ƴϱ� ������
		  ���� AAAŬ���� ��ü�� ������ �� ����ؾ� �Ѵ�.
		  BBB Ŭ������ AAA Ŭ������ ���ó�� �ٷ������ �ȴ�!!*/
	}
}