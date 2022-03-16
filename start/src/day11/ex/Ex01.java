package day11.ex;

/*
 	Ex01 ]
	 	랜덤하게 0 ~ 2 사이의 정수를 발생시켜서
	 		0 -- 원
	 		1 -- 삼각형
	 		2 -- 사각형
	 	을 만들어서 하나의 배열에 넣고 
	 	각 도형의 내용을 출력하세요.
	 	
	 	상속 클래스 만들어서 작성하기!
 */
public class Ex01 {
	// 객체를 담을 배열 변수 선언. 객체 만든거 아님!
	Shape[] sh;
	
	public Ex01() {
		sh = new Shape[10];
		
		setShape();
		shapePrint();
	}
	
	// 0 ~ 2 사이의 정수를 랜덤으로 받을 함수
	public int getRndNum() {
		return (int)(Math.random() * 3);
	}
	
	public void setShape() {
		// 각 방마다 객체 만들어주기
		for(int i = 0 ; i < sh.length ; i++) {
			
			// 랜덤 정수로 알맞는 클래스 객체 만들기
			switch(getRndNum()) {
			case 0:
				sh[i] = new Circle((int)(Math.random() * (25 - 1 + 1) + 1));
				break;
			case 1:
				sh[i] = new Triangle((int)(Math.random() * (25 - 1 + 1) + 1), (int)(Math.random() * (25 - 1 + 1) + 1));
				break;
			case 2:
				sh[i] = new Rectangle((int)(Math.random() * (25 - 1 + 1) + 1), (int)(Math.random() * (25 - 1 + 1) + 1));
				break;
			}
		}
	}
	
	// 각 객체에서 출력 함수를 호출하는 함수
	public void shapePrint() {
		for(int i = 0 ; i < sh.length ; i++) {
			sh[i].toPrint();
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
