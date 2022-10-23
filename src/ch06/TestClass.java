package ch06;

class TestClass {
	void instanceMethod() {} 		// 인스턴스 메서드
	static void staticMethod() {} 	// static 메서드
	
	void instanceMethod2() {	// 인스턴스 메서드
		instanceMethod();		// 다른 인스턴스 메서드를 호출한다.
		staticMethod();			// static 메서드를 호출한다.
	}
	
	static void staticMethod2() {	// static 메서드
//		instanceMethod();			// 에러!! 인스턴스 메서드를 호출할 수 없다.
		staticMethod();				// static 메서드는 호출할 수 있다.
	}
}
