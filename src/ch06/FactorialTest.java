package ch06;

class FactorialTest {
	public static void main(String[] args) {
		int result = factorial(5);
		
		System.out.println(result);
	}

	static int factorial(int n) {
		if(n <= 0 || n > 12) return -1; // 유효성 검사(StackOverFlow Error 방지)
		if(n == 1) return 1;
		
		return n * factorial(n-1); // 다시 메서드를 호출한다.
	}
}
