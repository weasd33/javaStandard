package ch06;

/*
	두 점의 거리를 계산하는 getDistance()를 완성하시오.
	
	[Hint] 제곱근 연산은 Math.sqrt(double a)를 사용하면 된다.
	
	[실행결과]
	1.4142135623730951
*/

class Exercise6_6 {
	// 두 점 (x, y)와 (x1, y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((Math.pow(x - x1, 2)) + Math.sqrt(Math.pow(y - y1, 2)));
	}
	
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
