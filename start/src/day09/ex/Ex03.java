package day09.ex;

/*
 	문제 3 ]
 		사각형의 넓이를 계산하는 프로그램을 작성하세요.
 		
 		길이를 랜덤하게 만들어주는 함수
 		넓이를 계산해주는 함수
 		사각형의 내용을 출력해주는 함수
 		
 */
public class Ex03 {
	int sideLen, area;
	
	public Ex03() {
		getLength();
		getArea();
		toPrint();
	}
	
	// 사각형 길이를 랜덤하게 만들어주는 함수
	void getLength() {
		sideLen = (int)(Math.random() * 40 + 1);
	}
	// 넓이를 계산해주는 함수
	void getArea() {
		area = sideLen * sideLen;
	}
	
	// 사각형의 길이와 넓이를 출력해주는 함수
	void toPrint() {
		System.out.println("길이가 " + sideLen + "인 사각형의 넓이는 " + area + " 이다.");
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
