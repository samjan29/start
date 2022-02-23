package day02;

public class Test05 {
	public static void main(String[] args) {
		// 3.14를 float타입 변수 pi에 기억해보자.
		
		float pi;	// 변수 선언
		
		pi = 3.14F;	// 변수 초기화 & 리터럴 형변환 
		// => float으로 선언 했어도 리터럴 풀에 double로 저장되기 때문에 형변환을 해줘야함
	}
	
	/*
	 	참고 ]
	 		개발자가 입력하는 정수형 데이터는 특별한 조작없이 모든 데이터형이 기억될 수 있음
	 		정수는 리터럴 형변환을 신경쓰지 않아도 된다
	 		예 ]
	 			int a = 100;
	 			byte b = 100;
	 			short c = 100;
	 			long d = 100;
	 */
}
