package day03.ex;

/*
 	문제 2]
 		하나의 숫자를 입력받은 후(원의 반지름)
 		그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
 		
 		참고 ]
 			원의 넓이 : 반지름 * 반지름 * 3.14
 			원의 둘레 : 2 * 반지름 * 3.14
 			
 */
import java.util.*;
// 이렇게 사용할 클래스의 경로를 지정하면
// java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 된다.
// 이 예제의 경우는 Scanner를 사용할 예정인데 직접 * 대신 Scanner로 명시해도 된다.

// 적용순서는 * 보다는 클래스 이름을 명시하는 방법을 우선 적용시킨다.

/*
 			A - abcd.txt
 				efg.txt
 				
 			B - abcd.txt
 				xyz.txt
 */
public class Ex02 {
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);	// 입력도구 준비
		
		System.out.print("원의 반지름 : ");		// 입력해야 하는 값을 알려주는 메세지 출력!
		
		int radius = sc.nextInt();		// 반지름 정수 입력 & 변수 선언, 초기화
		double pi = 3.14;				// 파이 변수 선언, 초기화
		
		// 원의 넓이, 둘레 변수 선언
		double area = radius * radius *pi;
		double circumference = 2 * radius * pi;
		
		// 값 출력
		System.out.println("원의 넓이 : " + area);
		System.out.println("원의 둘레 : " + circumference);
		
		/*
		 	참고 ]
		 		형변환에서 큰 타입의 데이터를 작은 타입으로 변환하면 남는 부분은 버린다.
		 */
		
		int intArea = (int)area;
		int intCircum = (int)circumference;
		System.out.println(intArea);
		System.out.println(intCircum);
	}
}
