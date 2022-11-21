package ch07.practice;

class DefaultMethodTest {
	public static void main(String[] args) {
		DMChild c = new DMChild();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

class DMChild extends DMParent implements MyInterface, MyInterface2 {
	public void method1() {
		System.out.println("method1() in DMChild"); // 오버라이딩
	}
}

class DMParent {
	public void method2() {
		System.out.println("method2() in DMParent");
	}
}

interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

