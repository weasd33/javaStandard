package ch07.practice;

class BindingTest2 {
	public static void main(String[] args) {
		BindParent2 p = new BindChild2(); // 부모타입의 참조변수로 자식인스턴스를 참조
		BindChild2 c = new BindChild2(); // 자식타입의 참조변수로 자식인스턴스를 참조
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class BindParent2 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class BindChild2 extends BindParent2 { }
