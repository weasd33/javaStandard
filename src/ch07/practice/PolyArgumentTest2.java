package ch07.practice;

class Product2 {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	
	// 기본 생성자
	Product2() {}
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class PolyTv2 extends Product2 {
	
	PolyTv2() { super(100); } // Product2(int price) 호출
	public String toString() { return "Tv"; }
}

class PolyComputer2 extends Product2 {
	
	PolyComputer2() { super(200); }
	public String toString() { return "Computer"; }
}

class PolyAudio2 extends Product2 {
	
	PolyAudio2() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer2 { // 고객, 구매자
	int money = 1000; // 소유 금액
	int bonusPoint = 0; // 포인트
	Product2[] item = new Product2[10]; // 구입한 제품을 저장할 배열
	int i = 0; // Product배열에 사용될 index
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		
		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 포인트 적립
		item[i++] = p;
		System.out.println(p + "제품을 구입하셨습니다.");
	}
	
	void summary() { // 구입한 물품에 대한 정보를 보여줌
		int sum = 0; // 구입한 물품의 가격합계
		String itemList = ""; // 구입한 물품목록
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new PolyTv2());
		b.buy(new PolyComputer2());
		b.buy(new PolyAudio2());
		b.summary();
	}
}
