package day05.ex;

import java.util.Scanner;

/*
	문제 8 ]
		숫자형식의 다섯자리 정수형태 문자열을 입력받아서
		각자리 수의 합을 구하는 프로그램을 작성하세요.
		
		문자열로 입력받아서 문자로 변환후 처리하세요.
 */

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력메세지 출력
		System.out.print("5자리의 숫자 입력 : ");
		
		// 5자리 숫자를 문자열로 입력 받아 선언한 변수에 할당
		String num = sc.nextLine();
		
		// 문자열 길이 알아내기
		int numLen = num.length();
		
		// 결과를 출력한 변수 선언초기화
		int result = 0;
		
		// 받은 정수의 각 자리 수의 합 구하는 반복문 작성
		for(int i = 0; i < numLen; i++) {
			char no1 = num.charAt(i);		// 문자열에서 문자 추출
			
			int no2 = Character.getNumericValue(no1);	// java.lang.Character클래스에 속한 getNumericValue() 함수!  
														// 문자(char) 변수에 할당된 숫자값을 아스키 코드로 바꾸지 않고 정수(int)로 바꿔준다!
			result += no2;		// 결괏값에 계속 더하기
		}
		
		// 결괏값 출력
		System.out.println("5자리 각각의 수의 합은 : " + result);

	}

}