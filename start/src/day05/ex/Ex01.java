package day05.ex;

/*
	1 ~ 10 까지의 합을 구해서 출력해주는 프로그램을 작성하세요.
	
	힌트 ]
		합은 결과값 변수로 만들어서 처리하세요.
*/
public class Ex01 {

	public static void main(String[] args) {
		// 변수 선언 & 초기화
		int total = 0;
		
		// 1 ~ 10까지 합을 구하는 반복문 작성
		for(int i = 0 ; i < 10 ; i++) {
			total += (i + 1);
		}
		
		// 결과값 출력
		System.out.println("1 ~ 10까지 더한 값은 : " + total);
		
		// 선생님 풀이
		// 결과값 변수 만들고
		int hap = 0;
		
		// 반복해서 누적 대입하고
		for(int i = 0 ; i < 10 ;  i++) {
			hap = hap + (i + 1);
		}
		
		// 결과 출력하고
		System.out.println("1 ~ 10 까지의 합은 " + hap + " 입니다.");
		
		// 1 ~ 10까지의 곱
		int gop = 1;		//	곱하기나 나누기 같은 0과 연산하면 값이 0이 되는 계산은 초기값을 1로 해야한다!
		for(int i = 0 ; i < 10 ; i++) {
			gop = gop * (i + 1);
		}
		System.out.println("1 ~ 10 까지의 곱은 " + gop + " 입니다.");
	}

}
