package smu_2;

public abstract class template_method_1{
	public final void prepareRecipe() {//final�� ������(�˰���)�� �������� ���´�. �������̵��� ������Ű�� ����
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	/*�߻�޼ҵ带 ����ؼ� �ڽ�Ŭ���������� �ʿ��Ѵ�� �����ϰ� �ϱ� ����
	 �ֳĸ� Ŀ��, ȫ�� �� ���Ḷ�� Ŀ�Ǹ� ���̰ų� ȫ���� ���̰ų� �ִ� 
	 ������������ �ٸ��� ������ �߻�Ŭ������ ���� �̿ϼ��� ���赵��
	 �����Ͽ� �ڼյ��� ����Ϸ� ��Ű�� �������� �����Ѵ�.*/
	public abstract void brew();
	public abstract void addCondiments();	
	
	
	//�������� ���� �޼ҵ�� �׳� �����س����� �ȴ�. 
	public void boilWater() {
		System.out.println("���� ���̴� ���Դϴ�.");	
	}
	public void pourInCup() {
		System.out.println("���Ḧ �ſ� ��� ���Դϴ�.");
	}

}


