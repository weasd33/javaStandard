package ch05;

/*
	2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
	
	[실행결과]
	total = 325
	average = 16.25
*/

public class Exercise5_4 {

	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5 },
				{ 10, 10, 10, 10, 10 },
				{ 20, 20, 20, 20, 20 },
				{ 30, 30, 30, 30, 30 }
		};
		
		int total = 0;
		float average = 0;
		
		/* 문제집 풀이
		// (1)
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		average = total / (float) (arr.length * arr[0].length);
		*/
		
		// 다른 방법
		int index = 0; // 배열의 총 개수를 담을 변수
		for(int[] arr1 : arr) {
			for(int v : arr1) {
				total += v;
				index++;
			}
		}
		average = total / (float) index;
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	} // end of main
} // end of class
