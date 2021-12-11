package smu_2;

import java.util.Scanner;

public abstract class CaffeineBeverageWithHook{
	public final void prepareRecipe() {//final로 레시피(알고리즘)를 고정시켜 놓는다. 오버라이딩을 금지시키기 위함
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			//사용자가 뭘 더 넣는다 하면 addCondiments를 한다.
			addCondiments();
		}
	}
	
	

	public abstract void brew();
	public abstract void addCondiments();	
	
	public void boilWater() {
		System.out.println("물을 끓이는 중입니다.");	
	}
	public void pourInCup() {
		System.out.println("음료를 컵에 담는 중입니다.");
	}
	boolean customerWantsCondiments() {
		//Hook
		return true;
	}

}




