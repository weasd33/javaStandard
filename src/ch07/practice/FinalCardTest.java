package ch07.practice;

class FinalCard {
	final int NUMBER; // 상수지만 선언과 함께 초기화 하지 않고
	final String KIND; // 생성자에서 단 한번만 초기화할 수 있다.
	static int width = 100;
	static int height = 250;
	
	FinalCard() {
		this("HEART", 1);
	}
	
	FinalCard(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

class FinalCardTest {
	public static void main(String[] args) {
		FinalCard c = new FinalCard("HEART", 10);
//		c.NUMBER = 5; // Error.
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // System.out.println(c.toString());
	}
}
