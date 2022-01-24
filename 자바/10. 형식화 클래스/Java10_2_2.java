package javajungsuk;

import java.text.DecimalFormat;

public class Java10_2_2 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		//Number - 모든 숫자 래퍼클래스의 최고 조상
		Number num = df.parse("1,234,567.89");
		double d = num.doubleValue();
	}

}
