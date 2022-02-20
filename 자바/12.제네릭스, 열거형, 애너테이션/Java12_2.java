package javajungsuk;

import java.util.ArrayList;
import java.util.Iterator;

public class Java12_2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕",1,1));
		list.add(new Student("자바짱",1,1));
		list.add(new Student("홍길동",1,1));

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
		//  Student s = (Student)it.next(); //제네릭스 사용하지 않았다면 형변환이 필요하다.
//			Student s = it.next();
//			System.out.println(s.name);
			System.out.println(it.next().name);
		}
		
	}
}

class Student{
	String name = "";
	int ban;
	int no;
	
	Student(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
}
