package ch07.exercise;

/*
	다음과 같은 실행결과를 얻도록 코드를 완성하시오.
	
	메서드명 : action
	기   능 : 주어진 객체의 메서드를 호출한다.
	 		DanceRobot인 경우, dance()를 호출하고,
	 		SingRobot인 경우, sing()을 호출하고,
	 		DrawRobot인 경우, draw()를 호출한다.
	반환타입 : 없음
	매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스
	
	[실행결과]
	춤을 춥니다.
	노래를 합니다.
	그림을 그립니다.
*/

class Exercise07_04 {
	// (1) action메서드 작성
	static void action(Robot r) {
		if(r instanceof DanceRobot)
			new DanceRobot().dance();
		if(r instanceof SingRobot)
			new SingRobot().sing();
		if(r instanceof DrawRobot)
			new DrawRobot().draw();
	}
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for(int i = 0; i < arr.length; i++)
			action(arr[i]);
	}
}

class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
