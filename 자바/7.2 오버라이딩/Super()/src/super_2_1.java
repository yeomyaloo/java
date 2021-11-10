class Point{
	int x,y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point{
	int z;
	Point3D(int x, int y int z) {
		super(x,y); // 조상 클래스의 생성자 Point(int x, int y)를 호출
		this.z = z; //자신의 멤버를 초기화
	}
}
