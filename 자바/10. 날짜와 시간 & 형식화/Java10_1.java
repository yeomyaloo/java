package javaStandard;

import java.util.Calendar;

public class Java10_1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int thisYear = cal.get(Calendar.YEAR); // ���ذ� ������� �˾Ƴ�
		int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE); //�� ���� ���������� �˾Ƴ�
		System.out.println(thisYear);
		System.out.println(lastDayOfMonth);
	}
	
}
