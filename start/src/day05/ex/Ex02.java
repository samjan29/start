package day05.ex;

/*
 	문제 2 ]
 		'A'부터 문자를 10개를 만들어서 출력하세요.
 */
public class Ex02 {

	public static void main(String[] args) {
		// 'A'로 초기화한 문자 변수 선언
		char ch = 'A';
		
		for(int i = 0 ; i < 10 ; i++) {
			int result = ch + i;
			System.out.println((char)result);
		}

	}

}
