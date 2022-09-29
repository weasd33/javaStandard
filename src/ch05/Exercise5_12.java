package ch05;

import java.util.Scanner;

/*
	영단어 맞추기 프로그램을 작성하시오.
	
	[실행결과]
	Q1. chair의 뜻은? dmlwk
	틀렸습니다. 정답은 의자입니다.
	
	Q2. computer의 뜻은? 컴퓨터
	정답입니다.
	
	Q3. integer의 뜻은? 정수
	정답입니다.
	
	전체 3문제 중 2문제 맞추셨습니다.
*/

public class Exercise5_12 {
	
	public static void main(String[] args) {
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		int score = 0; // 맞춘 문제 수
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
				score++;
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
			}
		} // end of for
		
		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", words.length, score);
	} // end of main
} // end of class
