package day04.ex;

/*
 	문제 2 ]
 		문자를 임의로 랜덤하게 입력한 후 그 문자가 대문자이면 소문자로 소문자이면 대문자로 변환하고
 		만약 특수문자이면 그 문자 그대로 출력하는 프로그램을 작성하세요. (3항 연산자 사용)
 		
 		참고 ]
 			아스키 코드 순서
 						 특수문자 - 숫자 ( 0 - 9 ) -
 						 특수문자 - 대문자 ( A ~ Z ) -
 						 특수문자 - 소문자 ( a ~ z ) - 특수문자
 		참고 ]
 			문자열에서 문자를 추출하는 방법
 				문자열.charAt(위치값)
 			이때 위치값은 0부터 시작한다.(DB를 제외하고는 모두 숫자는 0부터 시작)
 			
 			예 ]
 				"abcd"에서 두번째 문자를 추출하려면
 				"abcd".charAt(1) ==> 'b'
 				
 		'J' -> 'j'
 		==> (char)'J' + ('a' - 'A') ==> 'j'
 */
import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		// 선생님이 하신거
		// 입력도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 문자 입력 메세지 출력 & 문자열 입력
		System.out.print("문자 입력 : ");
		String str = sc.nextLine();
		
		// 문자열에서 문자 추출
		char ch = str.charAt(0);
				
		// 3항 조건 연산자로 판별
		char result = (ch < 'A') ? (ch) : (
						(ch <= 'Z') ? (char)(ch + ('a' - 'A')) : (
								(ch < 'a') ? ch : (
										(ch <= 'z') ? (char)(ch - ('a' - 'A')) : ch
										)
								)
						);
		
		/*
		 	A ~ Z - 특수문자 - a ~ z - 특수문자 
		 */
		// 결과 출력
		System.out.println("입력한 문자 : " + ch);
		System.out.println("변환된 문자 : " + result);
	}
}
