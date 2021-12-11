package smu_2;

import java.util.Scanner;

public abstract class CaffeineBeverageWithHook{
	public final void prepareRecipe() {//final�� ������(�˰���)�� �������� ���´�. �������̵��� ������Ű�� ����
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			//����ڰ� �� �� �ִ´� �ϸ� addCondiments�� �Ѵ�.
			addCondiments();
		}
	}
	
	

	public abstract void brew();
	public abstract void addCondiments();	
	
	public void boilWater() {
		System.out.println("���� ���̴� ���Դϴ�.");	
	}
	public void pourInCup() {
		System.out.println("���Ḧ �ſ� ��� ���Դϴ�.");
	}
	boolean customerWantsCondiments() {
		//Hook
		return true;
	}

}




