package javaStandard;

public class Java12_1_1 {

}



// Ŭ���� Box ����
class Box2 {
	Object itme;
	
	void setItem(Object item) {
		this.itme=item;
	}
	
	Object getItem(){
		return item;
	}
}

//���׸�
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
	static T item;// ���� �� ������ static ���Ÿ�� ������ ��� ��ü�� ���� �����ϰ� �����ؾ� �ϱ� ����
	
	
}
