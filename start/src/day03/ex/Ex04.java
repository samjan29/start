package day03.ex;

/*
 	1년은 365.2426일이다.
 	이것은 과연 며칠 몇시간 몇분 몇초인지를 계산하고 출력하세요.
 	
 	힌트 ]
 		365.2426일은 단위가 일 단위
 		하루는 24시간
 		따라서 0.5일은 12시간을 의미
 */
public class Ex04 {
	public static void main(String[] args) {
		double oneYear = 365.2426;		// 실수 변수 선언 & 초기화
		int day = 365;		// 일 변수 선언 & 초기화
		
		// double remainder = (oneYear - day) * 24;
		double remainder = oneYear % day * 24;	// 정수 일(day)를 제외한 실수 일을 시간으로 바꾸는 연산
		
		int hours = (int)remainder; 			// 실수 부분을 버리고 시간 변수에 저장
		
		// remainder = (remainder - hours) * 60;
		// 시간 값을 제외한 나머지를 분 단위로 바꿔 나머지 값에 저장
		remainder = remainder % hours * 60;
		
		int minutes = (int)(remainder);			// 실수 부분을 버리고 분 변수에 저장
		
		// remainder = (remainder - minutes) * 60;	
		// 분 값을 제외한 나머지를 초 단위로 바꿔 나머지 값에 저장
		remainder = remainder % minutes * 60;
		
		double seconds = remainder;
		
		System.out.println("1년은 365.2426일입니다. 365.2426일은");
		System.out.printf("%d일 %d시간 %d분 %.2f초입니다.(소수점 2자리까지만)\n", day, hours, minutes, seconds);
	}
}
