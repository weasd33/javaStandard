package ch06;

/*
	문제 Exercise6_6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오.
	
	[실행결과]
	1.4142135623730951
*/

class MyPoint {
	int x; // 인스턴스변수
	int y; // 인스턴스변수
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 인스턴스메서드 getDistance를 작성하시오.
	Double getDistance(int x1, int y1) {
		// x, y는 인스턴스 변수
		return Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2)); 
	}
}


class Exercise6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		// p와 (2, 2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
	}
}
