package javaStandard;

import java.util.Calendar;

public class Java10_1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int thisYear = cal.get(Calendar.YEAR); // 올해가 몇년인지 알아냄
		int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE); //이 달의 마지막날을 알아냄
		System.out.println(thisYear);
		System.out.println(lastDayOfMonth);
	}
	
}
