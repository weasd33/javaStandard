package ch06;

class ReturnData { int x; }

class ReferenceReturnEx {
	public static void main(String[] args) {
		ReturnData d = new ReturnData();
		d.x = 10;
		
		ReturnData d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static ReturnData copy(ReturnData d) {
		ReturnData tmp = new ReturnData(); // 새로운 객체 tmp를 생성
		tmp.x = d.x; // d.x의 값을 tmp.x에 복사
		
		return tmp; // 복사한 객체의 주소를 반환
	}
}
