package ch07.practice;

import java.util.Vector;

class Product3 {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	
	// 기본 생성자
	Product3() {
		this(0);
	}
	
	Product3(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class PolyTv3 extends Product3 {
	
	PolyTv3() { super(100); }
	public String toString() { return "Tv"; }
}

class PolyComputer3 extends Product3 {
	
	PolyComputer3() { super(200); }
	public String toString() { return "Computer"; }
}

class PolyAudio3 extends Product3 {
	
	PolyAudio3() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer3 { // 고객, 구매자
	int money = 1000; // 소유 금액
	int bonusPoint = 0; // 포인트
	Vector item = new Vector(); // 구입한 제품을 저장하는데 사용될 Vector 객체
	
	void buy(Product3 p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		
		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 포인트 적립
		item.add(p); // 구입한 제품을 Vector에 저장
		System.out.println(p + "제품을 구입하셨습니다.");
	}
	
	void refund(Product3 p) { // 제품 환불
		if(item.remove(p)) { // 제품을 Vector에서 제거
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "제품이 반품되었습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() { // 구입한 물품에 대한 정보를 보여줌
		int sum = 0; // 구입한 물품의 가격합계
		String itemList = ""; // 구입한 물품목록
		
		if(item.isEmpty()) { // Vector가 비어있을 경우
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i = 0; i < item.size(); i++) {
			Product3 p = (Product3)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		PolyTv3 tv = new PolyTv3();
		PolyComputer3 com = new PolyComputer3();
		PolyAudio3 audio = new PolyAudio3();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}
