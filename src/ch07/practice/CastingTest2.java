package ch07.practice;

class CastingTest2 {
	public static void main(String[] args) {
		CastingCar car = new CastingCar();
		CastingCar car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car; // 컴파일은 성공하지만 실행 시 Error.
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}