package javajungsuk;

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE",1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		return "kind: " + kind + ", number : "+number;
	}
	
}


public class Java9_3_1 {
	public static void main(String[] args) {
		
		System.out.println(new Card().toString());
		System.out.println(new Card().toString());
		
		/*결과 출력 클래스이름 객체주소
		  kind: SPADE, number : 1
          kind: SPADE, number : 1   */
	}

}