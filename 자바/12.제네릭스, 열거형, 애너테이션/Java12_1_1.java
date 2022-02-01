package javaStandard;

public class Java12_1_1 {

}



// 클래스 Box 정의
class Box2 {
	Object itme;
	
	void setItem(Object item) {
		this.itme=item;
	}
	
	Object getItem(){
		return item;
	}
}

//제네릭
class Box2<T>{
	T itme;
	
	void setItem(T item) {
		this.itme=item;
	}
	
	T getItem(){
		return item;
	}
}


class Box<T>{
	static T item;// 에러 그 이유는 static 멤버타입 변수는 모든 객체에 대해 동일하게 동작해야 하기 때문
	
	
}
