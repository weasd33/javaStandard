package ch06;

class FactorialTest {
	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}

	static int factorial(int n) {
		if(n == 1) return 1;
		
		return n * factorial(n-1); // 다시 메서드를 호출한다.
	}
}
