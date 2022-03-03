package day06.ex;

/*
 	문제 1 ]
 		3 ~ 100 사이의 정수를 입력받아서 이 정수가 소수인지 판단하는 프로그램을 작성하세요.
 		
 		참고 ]
 			소수
 				1 과 자신으로만 나누어지는 수
 				
 	보너스 ]
 		3 ~ 100 사이의 숫자 중에서 소수만 모두 출력하세요.
 */

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		// 조건에 맞지않는 정수를 입력하면 다시 입력할 수 있게 while문
		while(true) {
			// 입력메세지 출력
			System.out.print("3 ~ 100 사이의 정수를 입력하세요 : ");
			
			// 정수 변수에 입력받기
			num = sc.nextInt();
			
			if(num > 2) {
				break;
			}
		}
		
		// 소수인지 판별하는 반복문 만들기 (int i = (입력받은 값 - 1) ; i > 1 ; i--)
		String str = "";
		
		for(int i = num - 1 ; i > 1 ; i--) {
			int result = num % i;
			
			if(result == 0) {
				str = "소수가 아니";
				
				break;
			}
			
			if(i == 2) {
				str = "소수";
			}
		}
		System.out.println("입력받은 정수 " + num + " 는 " + str + "다.");
	}

}
