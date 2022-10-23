package ch06;

/*
	다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오.
	
	타 입		변수명	설 명
	String	name	학생이름
	int		ban		반
	int		no		번호
	int		kor		국어점수
	int		eng		영어점수
	int		math	수학점수
*/

class Student {
	String name;	// 학생이름
	int ban;		// 반
	int no;			// 번호
	int kor;		// 국어점수
	int eng;		// 영어점수
	int math;		// 수학점수
	
	public Student() {}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
	}
	
	String info() {
		return name + ", " +
			   ban + ", " +
			   no + ", " +
			   kor + ", " +
			   eng + ", " +
			   math + ", " +
			   getTotal() + ", " + getAverage();
	}
}
