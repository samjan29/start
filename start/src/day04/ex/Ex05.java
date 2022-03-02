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
import javax.swing.JOptionPane;

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
		System.out.println(num + "은(는) " + close + "에 가까우므로 " + result + "을(를) " + str);
		
		// 선생님 풀이
		// 세자리 정수를 입력 받는다.
		String sno = JOptionPane.showInputDialog("세자리 정수 입력 : ");
		
		// 입력 받은 데이터는 정수 형태의 문자열이므로 정수로 변환해줘야 한다.
		// 정수 형태의 문자열을 정수로 변환해주는 기능을 가지고 있는 함수는
		//			Integer.parseInt(문자열)
		int no = Integer.parseInt(sno);
		
		// 10단위 이하만 추출해낸다.
		int numT = no % 100;
		
		// numT가 50보다 큰지 판별한다.
		int hap = 0;	// 가까운 100의 배수가 되려면 필요한 수
		int resultT = 0;	// 가까운 100의 배수
		
		hap = (numT > 50) ? (100 - numT) // 76 ==> 100 - 76을 더해줘야 한다.
				: numT;
		
		// resultT = (numT > 50) ? (no + hap) : (no - hap);
		result = num > 50 ? (no / 100 + 1) * 100 : (no / 100) * 100;
		
		String strT = num > 50 ? "더해줘야 한다." : "빼줘야 한다.";
		
		// 출력
		System.out.println("입력한 정수 " + no + " 는 " + resultT + " 가까우므로 " + hap + " 을 " + strT);
	}
}
