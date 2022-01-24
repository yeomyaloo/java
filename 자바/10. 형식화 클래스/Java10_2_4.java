package javajungsuk;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Java10_2_4 {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		//오늘 날짜를 yyyy-MM-dd형태로 변환하여 반환
		String result = df.format(today);
		System.out.println(result);
	}
}
