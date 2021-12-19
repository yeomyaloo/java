package javaStandard;

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrrr~");
	}
	void stop() {
		System.out.println("Stop!!!");
	}
	class FireEngin extends Car{
		void water() {
			System.out.println("Water!!!");
		}
	}
	class Ambulance extends Car {
		void siren() {
			System.out.println("siren~~");
		}
	}
}