package day05.ex;

/*
	문제 5 ]
		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
		
		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
		가위, 바위, 보로 가정하고
		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
		
		누가 이겼는지를 확인하는 프로그램을 작성하세요.
		
		
		풀이 ]
			컴퓨터 - 사람으로 계산해서
			
					컴퓨터
					1		2		3
		사람	1	0		1		2
				2	-1		0		1
				3	-2		-1		0
				
				여기서
					비긴 경우 결괏값	0
					컴퓨터가 이긴 경우	1, -2
					사람이 이긴 경우	-1, 2
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
		
		
		
		// 선생님 풀이
		
		// 할일
		// 1. 입력도구 준비하고
			// 위에서 준비함
		
		while(true) {	// 반복되는 게임 프로그램!
			// 2. 입력메세지 출력하고
			System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요!\n게임종료는 0을 입력하세요!\n");
			
			// 3. 입력 받아서 변수에 기억하고
			int saram = sc.nextInt();
			System.out.println("***********************************");
			
			// 입력된 숫자가 종료숫자이면 바로 종료시킨다.
			if(saram == 0) {
				// 자원반환해주고
				sc.close();
				break;
			}
			
			// 컴퓨터와 사람의 코드에 따라서 가위, 바위, 보를 기억할 변수
			
			String sstr = "";
			switch(saram) {
			case 1:
				sstr= "가위";
				break;
			case 2:
				sstr= "바위";
				break;
			case 3:
				sstr= "보";
				break;
			default:
				continue;		// 잘못 입력해서 프로그램을 처음부터 다시 실행해야하는 경우
			}
			
			// 4. 랜덤하게 컴퓨터 숫자 만들고
			int samtl = (int)(Math.random() * (3 - 1 + 1) + 1);
			
			String comstr = "가위";
			switch(samtl) {
			case 2:
				comstr= "바위";
				break;
			case 3:
				comstr= "보";
				break;
			}
			
			// 5. 계산해서 결괏값 만들고
			int resultT = samtl - saram;
			
			// 6. 조건에 따라서 결과 출력하고
			
			// 반복하는 부분 줄이기
			String msg = "비";
			
			if(resultT == 1 || resultT == -2) {
				msg = "컴퓨터가 이";
			} else if(resultT == 2 || resultT == -1) {
				msg = "사람이 이";
			} else {
			}
			
			System.out.println("컴퓨터는 " + comstr + "\n사람은 " + sstr + "\n*** " + msg + "겼습니다. ***" );
			System.out.println("---------------------------------");
		}
		
		System.out.println("##### 게임이 종료되었습니다. #####");
	}

}