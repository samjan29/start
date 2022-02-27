package day04.ex;

/*
 	문제 4 ]
 		1000 ~ 3000 사이의 숫자를 랜덤하게 발생시켜서 이 숫자를 년도로 하는 해는
 		윤년인지 평년인지를 판별해서 출력해주는 프로그램을 작성하세요.
 	
 		참고 ]
 			윤년은 4로 나누어 떨어진 해 중에 100으로 나누어 떨어지고, 400으로도 나누어 떨어지는 해
 */
import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		// 윤년이 잘 나오는걸 보여줄 입력 도구 가져오기
		/*
			Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
			
			윤년 잘 나옴!
		*/
		
		// 1000 ~ 3000 사이의 랜덤 숫자 발생 후 변수 선언 & 할당
		int year = (int)(Math.random() * (3000 - 1000 + 1) + 1000);
		
		// 윤년 구하기 (4로 나누어 떨어지는지 -> 100으로 나누어 떨어지는지 -> 400으로 나누어 떨어지는지)
		String str = (year % 4 == 0) ? (
				(year % 100 == 0) ? (
						(year % 400 == 0) ? "윤년" : "평년"
						) : "평년"
				) : "평년";
						
		// 랜덤 숫자와 결과값 출력
		System.out.println("뽑은 년도 : " + year);
		System.out.println("그 해는 평년인가 윤년인가 : " + str);
	}
}
