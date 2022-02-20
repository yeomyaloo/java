package javajungsuk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Java12_2_2 {
	public static void main(String[] args) {
		HashMap<String, Student2> map = new HashMap<>(); //JDK1.7 생성자 타입 지정 생략 가능
		map.put("자바왕", new Student2("자바왕",1,1,100,100,100));
		
		Student2 s2 = map.get("자바왕");
		System.out.println(map);
	}
		
}

class Student2{
	String name = "";
	int ban;
	int no;
	int kor;
	int eng; 
	int math;
	
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng; 
		this.math = math;
	}
	
}
