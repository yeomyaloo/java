package javajungsuk;

import java.util.HashSet;
import java.util.Objects;

public class Java11_11 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); //중복으로 저장 X
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set);
	}

}

// equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작한다.
class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name +":" + age;
	}
	
	
	// equals 재정의
    @Override
    public boolean equals(Object o) {
    	if(!(o instanceof Person)) return false;
    	
    	Person p = (Person)o;
    	//나 자신(this)의 이름과 나이를 p와 비교
    	return this.name.equals(p.name) && this.age == p.age;
    }
    
    // hashcode 재정의
    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}
	
