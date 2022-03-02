package day04.ex;

/*
	문제 1 - 2 ]
		1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜서 그 수들 중 가장 큰 수, 중간 수, 작은 수를 구분해서
		출력하는 프로그램을 작성하세요.
		
		단, 조건문을 사용해 처리하세요.
*/
public class Ex01_02 {

	public static void main(String[] args) {
		// 랜덤한 숫자 3개 발생 후 변수 선언 & 초기화
		int a = (int)(Math.random() * (25 - 1 + 1) + 1);
		int b = (int)(Math.random() * (25 - 1 + 1) + 1);
		int c = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		// 값을 저장할 변수 선언 & 초기화
		String str = "";
		
		// 조건문을 이용해 대소 비교
		if(a > b) {
			if(a > c) {
				if(b > c) {
					str = a + " > " + b + " > " + c;
				} else {
					str = a + " > " + c + " > " + b;
				}
			} else {
				str = c + " > " + a + " > " + b;
			}
		} else {	// a < b
			if(b > c) {
				if(a > c) {
					str = b + " > " + a + " > " + c;
				} else {
					str = b + " > " + c + " > " + a;
				}
			} else {
				str = c + " > " + b + " > " + a;
			}
		}
		
		// 결과를 출력
		System.out.println("1 ~ 25 사이에서 무작위로 뽑은 숫자 3개 : " + a + ", " + b + ", " + c);
		System.out.println("3개의 숫자의 크기를 비교한 결과 : " + str);
	}

}
