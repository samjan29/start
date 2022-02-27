package day04.ex;

/*
 	문제 5 ]
 		3자리 숫자(100 ~ 999)를 입력받아서 이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
 		얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
 	
 	예 ]
 		241은 200에 가까우므로 41을 빼야한다.
 		777은 800에 가까우므로 23을 더해줘야 한다.
 		550은 500으로 만들고 551은 600으로 만들어야 한다.
 */

import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력 메세지 출력
		System.out.print("100 ~ 999 숫자 중 하나를 입력 : ");
		
		// 입력 받은 후 변수에 할당
		int num = sc.nextInt();
		
		// 가까운 100의 배수를 만들기 위해서는 얼마가 필요한지 계산
		// 근접한 100의 배수 값도 구해보기로 함
		int close = num / 100;
		int tmp = num % 100;
		
		String str = (tmp < 51) ? ("빼야줘야 한다.") : ("더해줘야 한다.");
		close = (tmp < 51) ? (close * 100) : ((close + 1) * 100);
		int result = (tmp < 51) ? (tmp) : (100 - tmp);
		
		// 출력
		System.out.println("입력 받은 숫자 : " + num);
		System.out.println(num + "은(는) " + close + "에 가까우므로 " + result + "을(를) " + str	);
	}
}
