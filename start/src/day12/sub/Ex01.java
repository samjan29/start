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
	// 인터페이스를 가져오는게 아님 인터페이스는 못 가져옴 배열을 만드는 것!
	Figure[] f = new Figure[10];
	
	public Ex01() {
		setFigureArray();
		figurePrint();
	}
	
	// 랜덤하게 3 ~ 5 정수를 발생시키는 함수
	public int getRndNum() {
		return (int)(Math.random() * (5 - 3 + 1) + 3);
	}
	
	// 10개의 도형 만들어 Figure 타입 배열에 넣는 함수
	public void setFigureArray() {
		// 10개의 도형을 만들기
		for(int i = 0 ; i < f.length ; i++) {
			int rndNum = getRndNum();
			switch(rndNum) {
			case 3:
				f[i] = new Dohyung(rndNum, (int)(Math.random() * (25 - 5 + 1) + 5), (int)(Math.random() * (25 - 5 + 1) + 5));
				break;
			case 4:
				f[i] = new Dohyung(rndNum, (int)(Math.random() * (25 - 5 + 1) + 5), (int)(Math.random() * (25 - 5 + 1) + 5));
				break;
			case 5:
				f[i] = new Dohyung(rndNum, (int)(Math.random() * (25 - 5 + 1) + 5));
				break;
			}
		}
	}
	
	// 출력
	public void figurePrint() {
		for(Figure dh : f) {
			dh.toPrint();
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}

class Dohyung implements Figure{
	private int no;
	private int radius, width, height;
	private double area, arround;
	
	public Dohyung() {}
	public Dohyung(int no, int width, int height) {
		this.no = no;
		this.width = width;
		this.height = height;
		
		setArea();
	}
	public Dohyung(int no, int radius) {
		this.no = no;
		this.radius = radius;
		
		setArea();
		setArround();
	}
	
	public void setArround() {
		arround = 2 * radius * 3.14;
	}
	
	@Override
	public void setArea() {
		switch(no) {
		case 3:
			area = width * height * 0.5;
			break;
		case 4:
			area = width * height;
			break;
		case 5:
			area = radius * radius * 3.14;
			break;
		}
	}
	
	@Override
	public void toPrint() {
		switch(no) {
		case 3:
			System.out.println("삼각형 - 밑변 : " + width + ", 높이 : " + height + ", 넓이 : " + area);
			break;
		case 4:
			System.out.println("사각형 - 가로 : " + width + ", 세로 : " + height + ", 넓이 : " + area);
			break;
		case 5:
			System.out.println("원 - 반지름 : " + radius + ", 둘레 : " + arround + ", 넓이 : " + area);
			break;
		}
	}
}