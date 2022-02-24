package day03.ex;

/*
 	문제 1]
 		두개의 숫자를 입력받은 후(가로, 세로)
 		그 숫자를 이용해서 
 		사각형의 넓이와 
 		삼각형의 넓이를 
 		구해서 결과를 출력하세요.
 		
 		출력형식 ]
 		
 			가로 : XXXXX
 			세로 : XXXXX
 			사각형 넓이 : XXXXXXXX
 			삼각형 넓이 : XXXXXX.X
 			
 		참고 ]
 			사각형의 넓이 : 가로 * 세로
 			삼각형의 넓이 : 밑변 * 높이 * 1/2
 			
 	참고 ]
 		자바에서 * 기호의 의미
 				1) 연산자 곱하기
 				2) 모든 것(ALL)
 */

import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력 메세지 출력
		System.out.print("가로 : ");
		
		/*
		  
		 	문자열로 입력받아서 처리하는 방법
				String garo = sc.nextLine();	// 문자열로 입력받는 방법
			정수 형태의 문자열을 정수로 변환하는 방법
				integer.parseInt(문자열);
				int width = Integer.parseInt(garo);
		
		 */
		
		/*
		 	정수로 입력받는 방법
		 		int 변수 이름 = sc.nextItn();
		 */
		
		// 가로 입력
		int width = sc.nextInt();
		
		// 출력
		System.out.println("입력된 정수 가로 : " + width);
		
		// 입력된 가로 값 출력
		System.out.print("세로 : ");
		
		// 세로 입력
		int height = sc.nextInt();
		
		// 입력된 세로 값 출력
		System.out.println("입력된 세로 : " + height);
		
		// 사각형 넓이
		int sagak = width * height;
		
		// 삼각형 넓이
		double samgak = width * height * 0.5;
		// width * height / 2로 연산하면 결과가 정수이기 때문에 정확한 값이 나오지 않음
		// 2.0이나 2.하면 괜찮음
		
		// 사각형, 삼각형 넓이 출력
		System.out.println("사각형의 넓이 : " + sagak);
		System.out.println("삼각형이 넓이 : " + samgak);
	}
}
