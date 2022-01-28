package javajungsuk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Java11_4_1 {

	public static void main(String[] args) {
		HashSet list = new HashSet();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
			
		}
	}

}
