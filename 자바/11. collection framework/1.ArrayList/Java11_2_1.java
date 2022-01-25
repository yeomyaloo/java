package javajungsuk;


import java.util.ArrayList;
import java.util.Collections;

public class Java11_2_1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		//autoboxing에 의해서 기본형으로 들어간 원래는 
		//list1.add(new Integer(5));이렇게 쓰는 게 맞음
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		//Collection - 인터페이스 / Collections - 유틸클래스
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		
		//list2가 list1에 있는지 확인하는 코드
		System.out.println("list1.containsAll(list2): "+list1.containsAll(list2));
		
		//맨 뒤에 값을 추가해줘
		list2.add("B");
		list2.add("C");
		//중간 3번째 자리에 A를 넣어라
		list2.add(3,"A"); 
		print(list1,list2);
		
		//교체
		list2.set(3, "AA");
		print(list1,list2);
		
		list1.add(0,"1");
		//지정된 객체의 위치(인덱스)를 알려준다.
		System.out.println("index = "+list1.indexOf("1"));
		print(list1,list2);
		
		list1.remove(new Integer(1));
		print(list1,list2);
		
		//list1[5]에 있는 객체 삭제
		list1.remove(5);
		print(list1,list2);
		
		//겹치는 부분만 남기고 나머지는 삭제한다. 
		System.out.println("list1.retainAll(list2): " +list1.retainAll(list2));
		print(list1,list2);
		
		for (int i = list2.size()-1;i>=0;i--) {
			if(true)
				list2.remove(0);
		}
		print(list1,list2);
	
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
		
	}
}
