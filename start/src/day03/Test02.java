package day03;

public class Test02 {
	public static void main(String[] args) {
		// 괄호가 없는 경우
		// 문자열 + double형 데이터
		System.out.println("3.14 + 10 : " + 3.14 + 10);
		// 1. "3.14 + 10 : " + 3.14 ==> "3.14 + 10 : 3.14"
		// 2. "3.14 + 10 : 3.14" + 10 ==> "3.14 + 10 : 3.1410"
		
		// 괄호로 먼저 처리해야할 부분을 감싸준다.
		System.out.println("3.14 + 10 : " + (3.14 + 10));
	}
}
