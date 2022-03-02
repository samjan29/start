package day05.ex;

/*
	문제 12 ]
		5자리 숫자 하나를 입력받아서 
		이 숫자가 회문수 인지 아닌지 판별하는 프로그램을 작성하세요.
		
		참고 ]
			회문수란?
				첫번째 자리수와 마지막 자리수
				두번째 자리수와 마지막에서 두번째 자리수
				...
				가 동일한 수를 말한다.
 */

import java.util.*;

public class Ex12 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력메세지 출력 (5자리 숫자를 입력하세요)
		System.out.print("5자리 숫자 하나를 입력 : ");
		
		// 문자열로 입력 받을 것
		String num = sc.nextLine();
		
		// 문자열 길이 알아내기
		int len = num.length();
		
		// 문자로 추출 받아 비교하고
		char ch1 = num.charAt(0);
		char ch2 = num.charAt(1);
		char ch4 = num.charAt(len - 2);
		char ch5 = num.charAt(len - 1);
		
		// if문을 이용해서 출력
		if(ch1 == ch5 && ch2 == ch4) {
			System.out.println("입력한 숫자는 회문수이다.");
		} else {
			System.out.println("입력한 숫자는 회문수가 아니다.");
		}
	}

}