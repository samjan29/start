package day02;

/**
 *  이 클래스는 변수 제작 연습용 클래스입니다.
 * @author	전다빈
 * @since	2022.02.23
 * @version v.1.0
 *
 *			변경이력 ]
 *				2022.02.23 - 클래스 제작
 *								담당자 : 전다빈
 */
public class Test03 {
	public static void main(String[] args) {
		// 제니의 나이를 기억하는 변수 age를 만들어서 26이라는 나이로 기억시키세요.

		// 할일
		// 1. 데이터의 형태를 정한다. 나이는 정수형이므로 정수로 선언
		//		정수의 기본 사용타입은 int이므로 int를 사용
		int age;	// 변수 선언
		
		// 2. 데이터를 기억시킨다.(변수 초기화)
		age = 26;
		
		/*
			참고 ]
				변수를 만들때 같은 영역 안에서 같은 이름의 변수는 두번 만들 수 없음
				
				예 ]
					int no;
					no = 100;
				
					....
				
					int no = 200; ==> no = 200;(재선언) or int num = 200;(다른 이름 사용)
				
			참고 ]
				같은 이름의 변수는 데이터 타입이 달라져도 다시 만들 수 없다.
				(JAVA에선 안됨)
				예 ]
					int nai;
					nai = 10;
					
					....
					
					String nai = "10";
		 */
		
		/*
		  	참고 ]
		  		변수를 만드는 것의 진정한 의미는 만들어진 변수가 기억하는 데이터를 재사용 하는데 있다.
		 */
		
		// 내용 출력
		System.out.println("제니의 나이 : " + age);
	}
}