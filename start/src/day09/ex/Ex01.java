package day09.ex;

/*
 	문제 1 ]
 		문자열로 계산식을 입력(정수만)하면
 		식에 맞는 계산을 해서 출력해주는 프로그램을 작성하세요.
 		
 		단, 계산은 +, -, *, /, % 만 처리하기로 하고
 		각 연산은 함수로 분리해서 처리하세요.
 		
 		입력, 출력, 계산을 모두 분리해서 함수로 만들어서 하세요.
 */

import java.util.*;

public class Ex01 {
	
	public Ex01() {
		Scanner sc = new Scanner(System.in);
		
		// 계산식 입력받고
		String[] sik = input(sc);
		
		//계산 결과 받고
		double result = calc(sik);
		
		System.out.println("연산 결과 : " + result);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
	
	// 입력함수
	public String[] input(Scanner s) {
		String[] str = new String[3];
		
		// 메세지 출력
		System.out.print("계산식 입력 : ");
		String sik = s.nextLine();
		
		// 문자열에서 숫자와 연산기호를 분리
		for(int i = 0 ; i < sik.length() ; i++) {
			char ch = sik.charAt(i);
			
			if(ch < '0' || ch > '9') {
				// 이 경우는 연산기호에 해당
				String sno1 = sik.substring(0, i);
				String sno2 = sik.substring(i + 1);
				
				str[0] = sno1;
				str[2] = sno2;
				str[1] = ch + "";
				
				// 반복 종료
				break;
			}
		}
		return str;
	}
	
	// 계산 처리해주는 함수
	public double calc(String[] arr) {
		double result = 0;
		
		int no1 = Integer.parseInt(arr[0]);
		int no2 = Integer.parseInt(arr[2]);
		
		String giho = arr[1];
		
		switch(giho) {
		case "+":
			result = plus(no1, no2);
			break;
		case "-":
			result = minus(no1, no2);
			break;
		case "*":
			result = multiply(no1, no2);
			break;
		case "/":
			result = division(no1, no2);
			break;
		case "%":
			result = remain(no1, no2);
			break;
		default:
			System.out.print("잘못된 기호가 입력됐습니다.");
		}
		
		return result;
	}
	
	// 두 수를 더해주는 기능의 함수
	public int plus(int no1, int no2) {
		return no1 + no2;
	}
	// 두 수를 빼주는 기능의 함수
	public int minus(int no1, int no2) {
		return no1 - no2;
	}
	// 두 수를 곱해주는 기능의 함수
	public int multiply(int no1, int no2) {
		return no1 * no2;
	}
	// 두 수를 나눠주는 기능의 함수
	public double division(int no1, int no2) {
		return no1 / (double)no2;
	}
	// 두 수를 더 해주는 기능의 함수
	public int remain(int no1, int no2) {
		return no1 % no2;
	}
}
