package day05.ex;

/*
	문제 11 ]
		2x + 4y = 10 의 방정식의 결과를 출력하세요.
		단, x, y는 모두 
			0 <= x, y <= 10
		사이의 숫자이다.
 */
public class Ex11 {

	public static void main(String[] args) {
		// 결과 안내 메세지 출력
		System.out.println("2x + 4y = 10 의 결과는? (0 <= (x, y) <= 10)");
		
		// 이중 for문으로 연산
		// x 한개의 값에 y 10개의 값 해보고 또 다음 x의 값 한개에 ....
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				// 2x + 4y 식을 담은 변수 선언
				int x = i;
				int y = j;
				int result = (2 * x) + (4 * y); 
				
				// 방정식이 10이 되는 경우만 출력
				if(result == 10){
					System.out.println("x : " + x + "\ty : " + y);
				}
			}
		}
	}

}