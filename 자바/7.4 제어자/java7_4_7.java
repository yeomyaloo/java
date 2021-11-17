package javajungsuk;

class Time{
	private int hour; //0~23사이의 값을 가져야 한다.
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour=hour;
	}
	public int getHour() {
		return hour;
	};

}

public class java7_4_7{
	public static void main(String[] arge) {
		Time t = new Time();
		//t.hour = -100;
		t.setHour(21);
		System.out.println(t.getHour());
//		t.setHour(100);
//		System.out.println(t.getHour());
	}
}