package javajungsuk;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId","1234");
		map.put("asdf","1111");
		map.put("asdf","1234");

		
		Scanner s = new Scanner(System.in); // 화면으로부터 라인 단위로 입력 받는
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id :");
			String id = s.nextLine().trim();
			
			System.out.print("password : ");
			String password = s.nextLine().trim(); //앞뒤공백제거
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			if(!(map.get(id)).equals(password)) {
				//get(id) --> 그 아이디에 해당하는 value를 반환
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
	
	}

}
