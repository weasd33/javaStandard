package ch07.practice;

class Tv2 {
	boolean power; // 전원상태(On/Off)
	int channel; // 채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class VCR {
	boolean power; // 전원상태(On/Off)
	int counter = 0;
	
	void power() { power = !power; }
	void play() { /* 내용 생략 */ }
	void stop() { /* 내용 생략 */ }
	void rew() { /* 내용 생략 */ }
	void ff() { /* 내용 생략 */ }
}

class TVCR extends Tv2 { // TVCR은 TV이다.
	VCR vcr = new VCR(); // TVCR은 VCR을 가지고 있다.
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}
