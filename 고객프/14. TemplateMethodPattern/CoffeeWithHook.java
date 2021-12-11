package smu_2;

import java.util.Scanner;

//상속
public class CoffeeWithHook extends CaffeineBeverageWithHook{
	public void brew() {
		System.out.println("필터로 커피를 우려내는 중");
	}
	public void addCondiments() {
		System.out.println("우유와 설탕을 추가하는 중");
	}
	public boolean customerWantsCondiments() {
		char answer = getUserInput();
		//입력받은 값이 y -> True no -> False
		return (answer == 'y') ? true:false;	
	}
	public char getUserInput() {
		String answer = null;
		System.out.println("음료에 우유와 설탕을 추가하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		answer = sc.next();
		return answer.charAt(0);
	}
}