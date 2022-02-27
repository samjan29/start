package day04.ex;

/*
 	1. 알파벳을 입력받아서 그 문자가 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요.
 	
 	2. 숫자 또는 알파벳을 입력받아서 그 문자가 숫자인지 대문자인지 소문자인지 판별하는 프로그램을 작성하세요.
 */

import java.util.*;

public class Ex0201 {
	public static void main(String[] args) {
		// 입력도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 알파벳 입력 메세지 출력
		System.out.print("알파벳 입력 : ");
		
		// 알파벳을 입력 받아 변수에 할당하고 문자열에서 문자 추출
		String str1 = sc.nextLine();
		char ch1 = str1.charAt(0);
		
		// 대문자인지 소문자인지 판별
		String result1 = (ch1 <= 'Z') ? ("대문자") : ("소문자");

		// 출력
		System.out.println("입력한 문자 : " + ch1);
		System.out.println("이 문자는 " + result1);
		
		// 숫자 또는 알파벳 입력 메세지 출력
		System.out.print("숫자나 알파벳 입력 : ");
		
		// 숫자 또는 알파벳을 입력 받아 변수에 할당하고 문자열에서 문자 추출
		String str2 = sc.nextLine();
		char ch2 = str2.charAt(0);
		
		// 숫자인지 대문자인지 소문자인지 판별
		String result2 = (ch2 <= '9') ? ("숫자") : (
				(ch2 <= 'Z') ? ("대문자") : ("소문자")
				);
		
		// 출력
		System.out.println("입력한 문자 : " + ch2);
		System.out.println("이 문자는 " + result2);
	}
}
