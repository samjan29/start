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
		/*
		 	변수를 좀 더 활용해야 한다.
		 	day를 oneYear에서 뽑을 수 있는데 숫자로 직접 선언한게 스스로도 너무 어이없고
		 	1년이 365일이라고 이미 알고 있어서 벌어진 일이라 웃기다. 벌써 두번이나!
		 	앞으로 생각하고 풀이하자!
		 */
		
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
		
		// 선생님 풀이
		
		// 데이터 변수에 기억
		double total = 365.2426;
		
		//누적계산될 변수 만들고
		double tmp = total;
		
		// 날수 구하고 누적 변수에 계산해서 업데이트
		int dayT = (int)tmp;
		tmp = tmp - dayT;		// tmp -= day;
		
		// 0.2426을 초로 변환
		// 1* 24 ==> 하루의 시간
		// 0.5 * 24 ==> 하루의 절반 시간
		// 0.1 * 24 ==> 0.1
		int tsec = (int)(0.2426 * 24 * 60 * 60);
		
		// 시간 구하고 누적 변수에 계산해서 업데이트
		int hourT = tsec / 60 / 60;
		
		tsec = tsec % (60 * 60);		// tsec %= 3600;
		
		// 분 구하고 누적 변수에 계산해서 업데이트
		int minT = tsec / 60;
		
		tsec = tsec % 60;
		
		// 초 구하고
		int secT = tsec;
		
		// 출력하고
		System.out.println("1 년은 " + total + " 일이고");
		System.out.println("이것은 " + dayT + " 일");
		System.out.println("       " + hourT + " 시간");
		System.out.println("       " + minT + " 분");
		System.out.println("       " + secT + "  초 이다.");
	}
}
