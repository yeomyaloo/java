package javajungsuk;

import java.util.Objects;

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
	
	//equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
	public int hashCode() {
		return Objects.hash(kind,number);
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		Card c = (Card)obj;
		return this.kind.equals(c.kind) && this.number==c.number;
		
	}
	
	
	public String toString() {
		return "kind: " + kind + ", number : "+number;
	}
	
}


public class Java9_3_2 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(new Card().toString());
		System.out.println(new Card().toString());
		System.out.println(c1.equals(c2));

	}

}