package smu_2;

public abstract class template_method_1{
	public final void prepareRecipe() {//final로 레시피(알고리즘)를 고정시켜 놓는다. 오버라이딩을 금지시키기 위함
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	/*추상메소드를 사용해서 자식클래스내에서 필요한대로 구현하게 하기 위함
	 왜냐면 커피, 홍차 등 음료마다 커피를 끓이거나 홍차를 끓이거나 넣는 
	 여러가지들이 다르기 때문에 추상클래스로 만들어서 미완성된 설계도를
	 제공하여 자손들이 설계완료 시키는 형식으로 진행한다.*/
	public abstract void brew();
	public abstract void addCondiments();	
	
	
	//공통으로 사용될 메소드는 그냥 구현해놓으면 된다. 
	public void boilWater() {
		System.out.println("물을 끓이는 중입니다.");	
	}
	public void pourInCup() {
		System.out.println("음료를 컵에 담는 중입니다.");
	}

}


