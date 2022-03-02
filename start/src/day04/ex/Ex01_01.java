package day04.ex;

/*
 	문제 1 ]
 		1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜서 그 수들 중 가장 큰 수, 중간 수, 작은 수를 구분해서
 		출력하는 프로그램을 작성하세요.
 		
 		단, 3항 연산자를 사용해서 처리하세요.
 */
public class Ex01_01 {
	public static void main(String[] args) {
		// 숫자를 3개 랜덤하게 발생시켜 변수에 할당
		int a = (int)(Math.random() * (25 - 1 + 1) + 1);
		int b = (int)(Math.random() * (25 - 1 + 1) + 1);
		int c = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		// 3항 연산자로 3개의 수 크기를 비교
		String str = (a > b) ? (
						(a > c) ? (
								(b > c) ? (a + ", " + b + ", " + c)		// a > b, a > c, b > c :: a > b > c
										: (a + ", " + c + ", " + b)		// a > b, a > c, b < c :: a > c > b
								  ) : (c + ", " + a + ", " + b)	// a > b, a < c :: c > a > b
							   ) : (	// a < b
						(b > c) ? (
								(a > c) ? (b + ", " + a + ", " + c)		// a < b, b > c, a > c :: b > a > c
										: (b + ", " + c + ", " + a)		// a < b, b > c, a < c :: b > c > a
							   	  ) :	(c + ", " + b + ", " + a)	// a < b, b < c :: c > b > a
							   );
		
		// 큰 순서대로 출력
		System.out.println("랜덤하게 발생시킨 3개의 수를 큰 순서대로 나열하면 : ");
		System.out.println(str);
	}
}
