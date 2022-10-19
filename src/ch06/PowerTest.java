package ch06;

// x¹부터 xⁿ까지의 합
class PowerTest {
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result += power(x, i);
		}
		
		System.out.println(result);
	}
	
	static long power(int x, int n) {
		// f(x, n) = x * f(x , n-1), 단 f(x, 1) = x
		if(n == 1) return x;
		return x * power(x, n-1);
		// 2 + 2 * 2 + 2 * 2 * 2 ...
	}
}
