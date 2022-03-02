package day04.ex;

/*
	문제 2 - 2 ]
		문자를 임의로 랜덤하게 입력한 후 그 문자가 대문자이면 소문자로 소문자이면 대문자로 변환하고
		만약 특수문자이면 그 문자 그대로 출력하는 프로그램을 작성하세요. (조건문 사용)
		
		참고 ]
			아스키 코드 순서
						 특수문자 - 숫자 ( 0 - 9 ) -
						 특수문자 - 대문자 ( A ~ Z ) -
						 특수문자 - 소문자 ( a ~ z ) - 특수문자
		참고 ]
			문자열에서 문자를 추출하는 방법
				문자열.charAt(위치값)
			이때 위치값은 0부터 시작한다.(DB를 제외하고는 모두 숫자는 0부터 시작)
			
			예 ]
				"abcd"에서 두번째 문자를 추출하려면
				"abcd".charAt(1) ==> 'b'
				
		'J' -> 'j'
		==> (char)'J' + ('a' - 'A') ==> 'j'
*/

import java.util.*;

public class Ex02_02 {

	public static void main(String[] args) {
		// 입력도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 입력메세지 출력하기
		System.out.print("문자(특수문자, 알파벳 대소문자) 입력 : ");
		
		// 임의의 문자 입력 받기
		String str = sc.nextLine();
		
		// 문자열에서 문자를 추출
		char ch = str.charAt(0);
		
		// 결과값을 할당할 변수 선언 & 초기화
		String result = "";
		
		// 대문자, 소문자, 특수문자를 구분하는 조건문 만들기
		if(ch < 'A') {
			result = ch + "";
		} else if(ch <= 'Z') {
			result = (char)(ch + ('a' - 'A')) + "";
		} else if(ch < 'a') {
			result = ch + "";
		} else if(ch <= 'z') {
			result = (char)(ch - ('a' - 'A')) + "";
		} else {
			result = ch + "";
		}
		
		// 결과값 출력하기
		System.out.println("입력 받은 문자 : " + ch);
		System.out.println("변환한 문자 : " + result);
	}

}
