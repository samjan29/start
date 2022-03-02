package day05.ex;

/*
	문제 5 ]
		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
		
		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
		가위, 바위, 보로 가정하고
		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
		
		누가 이겼는지를 확인하는 프로그램을 작성하세요.
		
 */

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 랜덤 숫자 발생 변수에 저장
		int com = (int)(Math.random() * (3 - 1 + 1) + 1);
		
		// 입력메세지 출력
		System.out.print("가위 : 1 , 바위 : 2 , 보 : 3\n1 ~ 3 중 하나를 입력하세요. : ");
		
		// 가위바위보 숫자로 입력 받기
		int user = sc.nextInt();
		
		// 결과값 변수 선언 초기화
		String result = "";
		
		// if ~ else if로 가위바위보 대결 결과 도출
		if(com == 1) {
			if(user == 1) {
				result = "비김";
			} else if(user == 2) {
				result = "사용자 승리";
			} else {
				result = "컴퓨터 승리";
			}
		} else if(com == 2) {
			if(user == 1) {
				result = "컴퓨터 승리";
			} else if(user == 2) {
				result = "비김";
			} else {
				result = "사용자 승리";
			}
		} else {
			if(user == 1) {
				result = "사용자 승리";
			} else if(user == 2) {
				result = "컴퓨터 승리";
			} else {
				result = "비김";
			}
		}
		
		// 출력
		System.out.println("가위바위보 결과!\n" + result);
	}

}