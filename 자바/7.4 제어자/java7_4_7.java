package javajungsuk;

class Time{
	private int hour;
	private int minute;
	private int second;
	
	Time (int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	
	public int getHour(int hour) {
		return hour;
	}
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	public int getMinute(int minute) {
		return minute;
	}
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	public int getSecond(int second) {
		return second;
	}
	public void setSecond(int second) {
		if (second < 0 || second > 59) return;
		this.second = second;
	}
	
	public static void main(String[] args) {
		Time t = new Time(12,35,30);
		System.out.println(t);
		
	}
	
}

