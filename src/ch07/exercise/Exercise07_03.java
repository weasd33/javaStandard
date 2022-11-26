package ch07.exercise;

/*
	class Marine { // 보병
		int x, y; // 현재 위치
		void move(int x, int y) {  지정된 위치로 이동  }
		void stop() {  현재 위치에 정지  }
		void stimPack() {  스팀팩 사용  }
	}
	
	class Tank { // 탱크
		int x, y; // 현재 위치
		void move(int x, int y) {  지정된 위치로 이동  }
		void stop() {  현재 위치에 정지  }
		void changeMode() {  공격모드 변환  }
	}
	
	class Dropship { // 수송선
		int x, y; // 현재 위치
		void move(int x, int y) {  지정된 위치로 이동  }
		void stop() {  현재 위치에 정지  }
		void load() {  선택된 대상을 태움  }
		void unload() {  선택된 대상을 내림  }
	}
*/

// 위 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고 상속받도록 하시오.

abstract class Unit {
	int x, y; // 현재 위치
	abstract void move(int x, int y); // 클래스마다 이동 방법이 다르므로 추상메서드로 정의
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit {
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stimPack() { /* 스팀팩 사용 */  }
}

class Tank extends Unit {
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void changeMode() { /* 공격모드 변환 */ }
}

class Dropship extends Unit { // 수송선
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void load() { /* 선택된 대상을 태움 */ }
	void unload() { /* 선택된 대상을 내림 */ }
}