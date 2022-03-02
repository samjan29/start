package day05.ex;

/*
	문제 13 ]
		랜덤한 두 수를 입력한 후
		두 수의 최대 공약수를 구하는 프로그램을 작성하세요.
		
		최대 공약수 :
			두 수의 약수중 제일 큰 수.
			두 수를 나눌 수 있는 수중 제일 큰 수
			
		extra ]
			위 문제가 해결되면 최소 공배수를 구하는 문제로 풀어보세요.
 */

import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 랜덤한 두 수 입력메세지 출력 & 입력
		System.out.print("숫자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력 : ");
		int num2 = sc.nextInt();

		// 조건문과 무한반복문 이용해서 최대 공약수 찾기
		if(num1 > num2) {
			for(int i = num2; i >= 0; i--) {
				if(num1 % i == 0 && num2 % i == 0) {
					System.out.println("두 수의 최대 공약수는 " + i);
					break;
				}
				
				if(i == 0) {
					System.out.println("두 수의 최대 공약수는 없다.");
				}
			}
		} else {
			for(int i = num1; i >= 0; i--) {
				if(num1 % i == 0 && num2 % i == 0) {
					System.out.println("두 수의 최대 공약수는 " + i);
					break;
				}
				
				if(i == 0) {
					System.out.println("두 수의 최대 공약수는 없다.");
				}
			}
		}
		
		// 최소 공배수 찾기
		
	}
}