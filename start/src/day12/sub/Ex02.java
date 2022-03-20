package day12.sub;

/*
	문제 1 ]
	랜덤하게 3 ~ 5 정수를 발생시켜서
	 	3이 나오면 삼각형
	 	4가 나오면 사각형
	 	5가 나오면 원
	의 형태로 10의 도형을 만들어서 하나의 변수로 관리하고
	각 도형의 내용을 출력하세요.
	
	단, 인터페이스의 구현은 무명 내부 클래스로 한다. 
*/
public class Ex02 {
	int len = 10;
	Figure[] figure = new Figure[len];
	
	public Ex02() {
		setInnerClass();
		figurePrint();
	}
	
	// 배열의 각각 인덱스에 무명 내부 클래스 만드는 함수
	public void setInnerClass() {
		for(int i = 0 ; i < len ; i++) {
			figure[i] = new Figure() {
				int no = (int)(Math.random() * (5 - 3 + 1) + 3);
				int radius = (int)(Math.random() * (25 - 5 + 1) + 5), width = (int)(Math.random() * (25 - 5 + 1) + 5), height = (int)(Math.random() * (25 - 5 + 1) + 5);
				double area, arround;
				
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
						arround = radius * 2 * 3.14;
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
			};
			
			figure[i].setArea();
		}
	}
	
	public void figurePrint() {
		for(Figure f : figure) {
			f.toPrint();
		}
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
