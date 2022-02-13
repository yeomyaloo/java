package javaStandard;

import java.util.ArrayList;

class Fruit implements Eatable{
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}
class Toy {
	public String toString() {
		return "toy";
	}
}
interface Eatable {}

public class FruitBoxEx2 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new FruitBox<Fruit>();
		Box<Apple> appleBox = new FruitBox<Apple>();
		//Box<Toy> toyBox = new FruitBox<Toy>();//에러.
		Box<Grape> grapeBox = new FruitBox<Grape>();
		//Box<Grape> grapeBox  = new FruitBox<Apple>(); // 에러. 타입 불일치!!
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // OK. void add(Fruit item)
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		//appleBox.add(new Grape()); //에러 Grape는 Apple의 자손이 아니다.
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
	}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T itme) {
		list.add(itme);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}
