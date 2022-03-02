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

public class Ex05_01 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력메세지 출력
		System.out.print("3자리 숫자(100 ~ 999) 중 하나를 입력 : ");
		
		// 3자리의 정수 입력 받아 변수에 저장
		int num = sc.nextInt();
		
		// 가장 가까운 100의 배수를 구하고 변수를 선언해서 저장
		int close = num / 100;
		int tmp = num % 100;
		
		// 위에서 구한 100의 배수가 되려면 얼마가 필요한지 구하고 변수를 선언해서 저장
		int result = 0;
		String str = "";
		
		if(tmp > 50) {
			close = (close + 1) * 100;
			result = 100 - tmp;
			str = "더해줘야 한다.";
		} else {
			close *= 100;
			result = tmp;
			str = "빼줘야 한다.";
			
		}
		
		// 결과를 출력
		System.out.println("입력 받은 숫자 : " + num);
		System.out.println(num + "에 가장 가까운 100의 배수 " + close + "를 만들려면 " + result + "를 " + str);
	}

}
