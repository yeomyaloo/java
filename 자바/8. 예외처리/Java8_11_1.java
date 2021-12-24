package javajungsuk;

import java.io.File;

public class Java8_11_1 {
	public static void main(String[] args) {
		try {
			File f = createFile("");
			System.out.println(f.getName()+" 파일이 성공적으로 생성되었습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage()+" 다시 입력해 주시기 바랍니다.");
		}
	}//main 메서드 끝
	static File createFile(String fileName) throws Exception {
		 try {
			 if (fileName == null || fileName.equals(""))
					throw new Exception("파일이름이 유효하지 않습니다.");
		 }catch(Exception e) {
			 fileName = "제목 없음";
		 }
		File f = new File(fileName); //File클래스 객체를 만든다
		f.createNewFile();
		return f; //생성된 객체의 참조를 반환한다. 
	}
}
