package javaStandard;

public class Java9_10 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = iVal + "";
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.valueOf(""+ strVal)
										+ Double.valueOf(strVal2);//문자열을 숫자로 바꾸는 방법
		double sum2 = Integer.valueOf(strVal)+Double.valueOf(strVal2);
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);

	}

}
