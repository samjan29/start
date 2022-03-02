package day05.ex;

/*
 	문제 3 ]
 		문자열을 입력 받아서 문자를 한글자씩 추출해서 출력하세요.
 		
 		참고 ]
 			문자열의 길이를 알아내는 방법
 			
 				int 변수 = 문자열.length();		// length는 함수
 				 				
 */

import java.util.*;
import javax.swing.*;

public class Ex03 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력메세지 출력
		System.out.print("문자열 입력 : ");
		
		// 문자열 변수를 선언해 입력 값을 할당
		String str = sc.nextLine();
		
		// 문자열 길이를 알아내기
		int strLength = str.length();
		
		// 문자를 한글자씩 추출해서 출력
		for(int i = 0 ; i < strLength ; i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}
		
		// 선생님 풀이
		// 문자열에서 문자를 한글자씩 추출하려면
		// 전체 문자열의 길이를 알아내고
		// 그 길이만큼 반복해서 추출해준다.
		
		// 할일
		// 1. 문자열 입력받아서 기억하고
		String strT = JOptionPane.showInputDialog("문자열을 입력하세요!");
		
		// 2. 입력받은 문자열의 길이 알아내고
		int len = strT.length();
		
		// 3. 길이만큼 반복해서 한글자씩 추출해서 출력해준다.
		for(int i = 0 ; i < len ; i++) {
			char ch = strT.charAt(i);
			/* 
			 	참고 ]
			 		문자를 문자열로 변환시키는 방법
			 			문자 + "";
			 */
			System.out.println((i + 1) + " 번째 문자 : [" + ch + "]");
		}
	}

}
