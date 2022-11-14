package ch07.practice;

class BindingTest3 {
	public static void main(String[] args) {
		BindParent3 p = new BindChild3(); // 부모타입의 참조변수로 자식인스턴스를 참조
		BindChild3 c = new BindChild3(); // 자식타입의 참조변수로 자식인스턴스를 참조
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class BindParent3 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class BindChild3 extends BindParent3 {
	int x = 200;
	
	void method() {
		System.out.println("x=" + x); // this.x
		System.out.println("super.x=" + super.x);
		System.out.println("this.x=" + this.x);
	}
}
