package day05.ex;

/*
	문제 7 ]
		5자리의 숫자를 입력한 후
		각자리의 수의 합을 구하는 프로그램을 작성하세요.
 */

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력메세지 출력
		System.out.print("5자리의 숫자 입력 : ");
		
		// 5자리 숫자를 정수로 입력 받아 선언한 변수에 할당
		int num = sc.nextInt();
		
		// 결과를 출력한 변수 선언초기화
		int result = 0;
		
		// 받은 정수의 각 자리 수의 합 구하는 반복문 작성
		for(int i = 0; i < 5; i++) {			
			int no = num / ((int)Math.pow(10, 5 - (i + 1)));		// Math.pow()는 제곱을 구하는 java.lang.Math 클래스의 pow 함수!
			
			result += no;		// 결괏값에 계속 더하고
			
			num -= no * ((int)Math.pow(10, 5 - (i + 1)));	// 더한 자리의 숫자를 큰 자리부터 없애주기
		}
		
		// 결괏값 출력
		System.out.println("5자리 각각의 수의 합은 : " + result);
	}

}