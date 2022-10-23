package ch06;

/*
	다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
	
	타 입		변수명	설 명
	int		num		카드의 숫자.(1~10사이의 정수)
	boolean isKwang 광(光)이면 true, 아니면 false
*/

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() { // 초기값 미지정시 1, true로 세팅
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		if(isKwang)
			return num + "K";
		
		return num + ""; // isKwang == false
	}
}
