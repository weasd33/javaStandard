package ch07.practice;

class CastingTest1 {
	public static void main(String[] args) {
		CastingCar car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (CastingCar)fe;에서 형변환이 생략된 형태
//		car.water(); // CastingCar타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine)car; // 부모타입 -> 자식타입 (형변환 생략 불가능)
		fe2.water();
	}
}

class CastingCar {
	String color;
	int door;
	
	void drive() { // 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	void stop() { // 멈추는 기능
		System.out.println("stop!!");
	}
}

class FireEngine extends CastingCar { // 소방차
	void water() { // 물 뿌리는 기능
		System.out.println("water!!");
	}
}

class Ambulance extends CastingCar { // 구급차
	void siren() { // 사이렌을 울리는 기능
		System.out.println("siren~~");
	}
}

