package javajungsuk;

public class Java8_6_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		try {
			Exception e = new Exception("고의로 발생시켰음");
			throw e; // 예외를 발생시킴
			// throw new Exception("고의로 발생시켰음");
		} catch(Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료 되었음.");
		
	}

}
