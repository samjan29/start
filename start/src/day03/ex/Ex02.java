package day03.ex;

/*
 	문제 2]
 		하나의 숫자를 입력받은 후(원의 반지름)
 		그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
 		
 		참고 ]
 			원의 넓이 : 반지름 * 반지름 * 3.14
 			원의 둘레 : 2 * 반지름 * 3.14
 			
 */
import java.util.*;
public class Ex02 {
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);	// 입력도구 준비
		
		System.out.print("원의 반지름 : ");		// 입력해야 하는 값을 알려주는 메세지 출력!
		
		int radius = sc.nextInt();		// 반지름 정수 입력 & 변수 선언, 초기화
		double pi = 3.14;				// 파이 변수 선언, 초기화
		
		// 값 출력
		System.out.println("원의 넓이 : " + (radius * radius * pi));
		System.out.println("원의 둘레 : " + (2 * radius * pi));
	}
}
