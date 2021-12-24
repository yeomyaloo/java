package javajungsuk;

import javax.management.RuntimeErrorException;

public class Java8_14_1 {

	public static void main(String[] args) {
		try { //Exception과 그 자손은 반드시 예외처리를 해줘야 한다.
			throw new Exception();
		} catch(Exception e) {}
		
		//RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일 된다.
		throw new RuntimeException();
	}

}
