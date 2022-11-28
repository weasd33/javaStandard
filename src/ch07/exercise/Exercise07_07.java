package ch07.exercise;

/*
	다음과 같은 실행결과를 얻도록 (1)~(4)의 코드를 완성하시오.
	
	[실행결과]
	30
	20
	10
*/

class Outer {
	int value = 10;
	
	class Inner {
		int value = 20;
		
		void method1() {
			int value = 30;
			
			// (1)
			System.out.println(value);
			// (2)
			System.out.println(this.value);
			// (3)
			System.out.println(Outer.this.value);
		}
	} // End of Inner
} // End of Outer


class Exercise07_07 {
	public static void main(String[] args) {
		// (4)
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		inner.method1();
	}
}
