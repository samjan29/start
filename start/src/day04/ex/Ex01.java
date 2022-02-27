package day04.ex;

/*
 	문제 1 ]
 		1 ~ 25의 숫자 3개를 랜덤하게 발생시켜서
 		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하세요.
 		
 		단, 3항 연산자를 사용해서 처리하세요.
 */
public class Ex01 {
	public static void main(String[] args) {
		// 랜덤으로 1 ~ 25 사이의 숫자 뽑기 & 변수 할당
		int result1 = (int)(Math.random() * (25 -1 + 1) + 1);
		int result2 = (int)(Math.random() * (25 -1 + 1) + 1);
		int result3 = (int)(Math.random() * (25 -1 + 1) + 1);
		
		// 숫자 3개를 비교하는 3항 연산자
		int bigNum = (result1 <= result2) ?
						((result2 <= result3) ? result3 : result2) :
						((result1 <= result3) ? result3 : result1);
		
		// 뽑은 숫자들을 출력해서 알려주고
		System.out.println("뽑은 숫자 3개 : " + result1 + ", " + result2 + ", " + result3);
		// 큰 수 출력
		System.out.println("3개의 숫자 중 가장 큰 수는 : " + bigNum);
							
	}
}
