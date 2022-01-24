package javajungsuk;

import java.text.DecimalFormat;

public class Java10_2_3 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			
			//문자를 숫자로 바꿀 땐 parse 사용
			Number num = df.parse("1,234,567.89");
			System.out.println("1,234,567.89" + " -> ");
			
			double d = num.doubleValue();
			System.out.println(d + " -> ");
			
			//숫자를 형식문자열로 바꿀땐 format을 사용
			System.out.println(df2.format(num));
			
		}catch (Exception e) {}


	}

}
