package smu_2;

import java.util.Scanner;

//���
public class CoffeeWithHook extends CaffeineBeverageWithHook{
	public void brew() {
		System.out.println("���ͷ� Ŀ�Ǹ� ������� ��");
	}
	public void addCondiments() {
		System.out.println("������ ������ �߰��ϴ� ��");
	}
	public boolean customerWantsCondiments() {
		char answer = getUserInput();
		//�Է¹��� ���� y -> True no -> False
		return (answer == 'y') ? true:false;	
	}
	public char getUserInput() {
		String answer = null;
		System.out.println("���ῡ ������ ������ �߰��Ͻðڽ��ϱ�?");
		Scanner sc = new Scanner(System.in);
		answer = sc.next();
		return answer.charAt(0);
	}
}