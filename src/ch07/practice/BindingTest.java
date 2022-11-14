package ch07.practice;

class BindingTest {
	public static void main(String[] args) {
		BindParent p = new BindChild(); // 부모타입의 참조변수로 자식인스턴스를 참조
		BindChild c = new BindChild(); // 자식타입의 참조변수로 자식인스턴스를 참조
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class BindParent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class BindChild extends BindParent {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}
