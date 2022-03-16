package day11;

/*
 	랜덤하게 0 ~ 2 사이의 정수를 발생시켜서
 		0 -- 원
 		1 -- 삼각형
 		2 -- 사각형
 	을 만들어서 하나의 배열에 넣고 
 	각 도형의 내용을 출력하세요.
 */
public class Test06 {
	public Test06() {
		Moyang[] mo = new Moyang[10];
		
		for(int i = 0 ; i < mo.length ; i++) {
			// 도형 결정 정수 발생
			int soo = (int)(Math.random() * (2 - 0 + 1) + 0);
			
			int no1 = (int)(Math.random() * 21 + 5);
			int no2 = (int)(Math.random() * 21 + 5);
			
			if(soo == 0) {
				mo[i] = new Circle01(no1);	// 원의 객체를 만들어서 채워준다.
			} else if(soo == 1) {
				mo[i] = new Semo01(no1, no2);
			} else if(soo == 2) {
				mo[i] = new Nemo01(no1, no2);
			}
		}
		
		// 출력
		for(int i = 0 ; i < mo.length ; i++) {
			mo[i].toPrint();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
