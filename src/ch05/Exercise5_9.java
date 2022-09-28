package ch05;

/*
	주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
	
	[실행결과]
	**
	**
	*****
	*****
	
	****
	****
	**
	**
	**
*/

public class Exercise5_9 {
	
	public static void main(String[] args) {
		char[][] star = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				// (1)
				result[j][i] = star[star.length-1-i][j];
				// result의 첫번째 열은 star의 마지막 행이 된다.
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	} // end of main
} // end of class
