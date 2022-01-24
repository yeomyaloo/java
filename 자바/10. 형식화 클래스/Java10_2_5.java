package javajungsuk;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Java10_2_5 {
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		Date d = df.parse("2022년 01년 24일");
		String result = df2.format(d);

	}
}
