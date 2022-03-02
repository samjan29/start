package day05.ex;

/*
	문제 6 ]
		랜덤하게 정수를 컴퓨터가 만들어 내면
		그 수를 알아맞추는 게임을 만드세요.
		
		예 ]
			
			발생숫자 : 54
			
			사용자입력숫자 : 45
			
			==> "입력한 수가 더 작습니다."
			로 메세지 를 출력해서 사용자가 숫자를 알아맞추는 게임...
			
			횟수도 같이 출력되게 하세요.
 */

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 0 ~ 200 사이의 랜덤한 정수를 선언한 변수에 할당
		int num = (int)(Math.random() * (200 - 0 + 1) + 0);
		
		// 1 입력메세지 출력하고 2 입력받고 숫자를 맞춰보고 3 시도한 횟수를 알려주는 반복문 만들기
		for(int i = 0;;i++) {
			System.out.print("0 ~ 200 사이의 숫자를 입력하세요 : ");
			
			int userNum = sc.nextInt();
			
			if(userNum > num) {
				System.out.print("입력한 수가 더 큽니다!\t");
			} else if(userNum < num) {
				System.out.print("입력한 수가 더 작습니다!\t");
			} else {
				System.out.print("시도한 횟수 : " + (i + 1) + "\t");
				
				break;
			}
			
			System.out.println("다시 한번 해보세요!\n시도한 횟수 : " + (i + 1));
		}
		
		// 축하메세지 출력
		System.out.println("정답 : " + num + "\n축하합니다! 성공했습니다!");
	}

}