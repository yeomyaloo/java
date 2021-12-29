package javaStandard;
//equals() 오버라이딩 없이 사용할 때
//객체의 주소를 비교하기 때문에 서로 다른 것으로 인식한다.
public class Ex9_1_1 {
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

}