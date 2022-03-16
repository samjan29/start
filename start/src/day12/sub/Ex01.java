package day12.sub;

/*
 	문제 1 ]
		랜덤하게 3 ~ 5 정수를 발생시켜서
		 	3이 나오면 삼각형
		 	4가 나오면 사각형
		 	5가 나오면 원
		의 형태로 10의 도형을 만들어서 하나의 변수로 관리하고
		각 도형의 내용을 출력하세요.
*/
public class Ex01 {
	// 길이가 10인 객체 배열 변수 선언
	// 인터페이스를 가져오는게 아님 인터페이스는 못 가져옴 배열을 만드는 것!
	Figure[] f;
	
	public Ex01() {
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
