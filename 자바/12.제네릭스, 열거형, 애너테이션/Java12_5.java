package javajungsuk;
//			     0      1     2      3
enum Direction {EAST, SOUTH, WEST, NORTH}

public class Java12_5 {
	public static void main(String[] args) {
		//열거형 지정 방법
		Direction d1 = Direction.EAST; // 열거형타입.상수이름
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("d3 = "+d3);
		
		System.out.println("d1 == d2 ? "+(d1 == d2));
		System.out.println("d1 == d3 ? "+(d1 == d3));
		
		System.out.println("d1.equals(d3) ? "+d1.equals(d3));
		//System.out.println("d2 > d3 ? "+ (d1>d3)); 에러
		
		System.out.println("d1.compareTo(d3) ? " +(d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? " +(d1.compareTo(d2)));
		
		
		switch(d1) { //이때 Direction.EAST라고 쓸 수 없다.
			case EAST:
				System.out.println("The Direction is EAST"); break;
			case SOUTH:
				System.out.println("The Direction is SOUTH"); break;
			case WEST:
				System.out.println("The Direction is WEST"); break;
			case NORTH:
				System.out.println("The Direction is NORTH"); break;
		}
		
		Direction[] dArr = Direction.values(); //열거형의 모든 상수를 배열로 반환
		
		for (Direction d : dArr) //for(Direction d : Direction.values())
			System.out.printf("%s=%d%n", d.name(), d.ordinal()); //순서
		
	}

}


