package javajungsuk;

import java.util.ArrayList;

class Tv{}
class Audio{}


public class GenericTest {
	public static void main(String[] args) {
		ArrayList<Tv> list = new ArrayList<Tv>(); //Tv타입의 객체만 저장가능
		list.add(new Tv());
		//list.add(new Audio());
		
		
		//Tv t = (Tv)list.get(0);
		Tv t = list.get(0);
		System.out.println(t);
	}
}
