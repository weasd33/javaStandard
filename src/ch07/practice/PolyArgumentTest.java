package ch07.practice;

class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품 구매 시 제공하는 보너스점수 
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스점수는 제품가격의 10%
	}
}

class PolyTv extends Product {
	
	PolyTv() {
		// 부모클래스의 생성자 Product(int price)를 호출한다.
		super(100); // PolyTv의 가격을 100만원으로 한다.
	}
	
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "PolyTv"; }
}

class Computer extends Product {
	
	Computer() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Buyer { // 고객, 물건을 사는 사람
	int money = 1000; // 소유금액
	int bonusPoint = 0; // 보너스점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		
		money -= p.price; // 가진 돈에서 제품 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}

class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new PolyTv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
	}
}
