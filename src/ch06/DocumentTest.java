package ch06;

class DocumentTest {
	static int count = 0;
	String name;	// 문서명(Document name)
	
	DocumentTest() {	// 문서 생성 시 문서명을 지정하지 않았을 때
		this("제목없음" + ++count); // == DocumentTest(String name)
	}
	
	DocumentTest(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
	
	public static void main(String[] args) {
		DocumentTest d1 = new DocumentTest();
		DocumentTest d2 = new DocumentTest("자바.txt");
		DocumentTest d3 = new DocumentTest();
		DocumentTest d4 = new DocumentTest();
	}
}
