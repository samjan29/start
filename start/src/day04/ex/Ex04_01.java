package day04.ex;

/*
	문제 4 - 1 ]
		1000 ~ 3000 사이의 숫자를 랜덤하게 발생시켜서 이 숫자를 년도로 하는 해는
		윤년인지 평년인지를 판별해서 출력해주는 프로그램을 작성하세요.
	
		참고 ]
			윤년은 4로 나누어 떨어진 해 중에 100으로 나누어 떨어지고, 400으로도 나누어 떨어지는 해
			
	조건문으로 하기
*/
public class Ex04_01 {

	public static void main(String[] args) {
		// 1000 ~ 3000 사이의 숫자를 랜덤하게 발생시켜서 변수에 할당
		int year = (int)(Math.random() * (3000 - 1000 + 1) + 1000);
		
		// 조건문의 결과값을 저장할 변수 초기화
		String result = "";
		
		// 윤년인지 평년인지 판별하는 조건문을 작성
		if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			result = "윤년";
		} else {
			result = "평년";
		}
		
		// 출력
		System.out.println("랜덤으로 나온 년도 : " + year);
		System.out.println("결과 : " + result);
	}

}
