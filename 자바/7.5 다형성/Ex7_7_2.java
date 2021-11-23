package javajungsuk;


public class Ex7_7_2 {
	public static void main(String[] args) {
		Car c = new Car();
		FireEngine fe = (FireEngine)c; //형변환 에러 java.lang.ClassCastException
		fe.water();//컴파일은 가능 ClassCastException 발생!!
		
	}
}
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("Water!!!");
	}
}
