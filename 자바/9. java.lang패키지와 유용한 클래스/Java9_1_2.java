package javaStandard;
//equals() 오버라이딩을 해준 뒤 사용할 때 
//객체 값을 비교하기 때문에 같은 것으로 인식한다. 
public class Ex9_1_2 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
				
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}

}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
	
	public boolean equals(Object obj) {
		
		//참조변수의 형변환 전에는 반드시 instanceof로 확인해주어야 한다
		if (!(obj instanceof Value)) return false;
		Value v = (Value)obj; // obj는 값이 없기에 형변환를 해준다. 
		
		return this.value == v.value;
		
	}
}