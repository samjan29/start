package day09.ex;

/*
 	문제 2 ]
 		반지름 하나를 랜덤하게 입력한 후
 		원의 넓이
 		원의 둘레
 		를 계산해서
 		출력하는 프로그램을 작성하세요.
 		
 		반지름 랜덤하게 만들어주는 함수
 		넓이 계산함수, 둘레 계산함수, 출력을 해주는 함수
 		를 각각 만들어서 작성하세요.
 		
 */
public class Ex02 {
	double pi = 3.14;
	
	public Ex02() {
		// 반지름 반환값
		int radius = getRadius();
		
		// 반지름값으로 넓이 구해서 변수에 저장
		double area = getArea(radius);
		
		// 반지름값으로 둘레 구해서 변수에 저장
		double circum = getCircum(radius);
		
		// 출력하기
		toPrint(radius, area, circum);
	}
	
	// 반지름을 랜덤하게 만들어주는 함수
	int getRadius() {
		// 1 ~ 40 의 랜덤한 정수를 반지름으로 반환
		int radius = (int)(Math.random() * (40 - 1 + 1) + 1);
		return radius;
	}
	
	// 넓이 계산 함수
	double getArea(int radius) {
		double area = radius * radius * pi;
		return area;
	}
	
	// 둘레 계산 함수
	double getCircum(int radius) {
		double circum = 2 * radius * pi;
		return circum;
	}
	
	// 출력 해주는 함수
	void toPrint(int radius, double area, double circum) {
		System.out.println("반지름값이 " + radius + "인 원의 넓이는 " + area + "이고 둘레는 " + circum + "이다.");
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
