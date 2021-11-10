class MyPoint3_2 extends Object{
	int x;
	int y;
	MyPoint3_2(int x, int y){
		this.x = x;
		this.y = y;
	}
	//Object 클래스의 toString()을 오버라이딩
	public String toString(){
		return "x: " + x + ", y : "+ y;
		 }
}

public class overridingTest2 {
	public static void main(String[] args) {
		MyPoint3_2 p = new MyPoint3_2(3,5);
		System.out.println(p);
	}

}
