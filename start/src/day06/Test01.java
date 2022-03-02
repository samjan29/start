package day06;

public class Test01 {

	public static void main(String[] args) {
		
		loop:	// 레이블 i를 카운터변수로 쓰는 반복문의 이름
		for(int i = 2 ; i < 10 ; i++) {
			
			for(int j = 1 ; j < 10 ; j++) {
				if(i == 5 && j == 3) {
					break loop;  // loop라는 반복문 즉시 종료
				}
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}

	}

}
