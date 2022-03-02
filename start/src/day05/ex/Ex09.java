package day05.ex;

/*
	문제 9 ]
		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
 */
public class Ex09 {

	public static void main(String[] args) {
		// 결과를 할당할 변수 선언
		int result = 0;
		
		// 100까지 넘기는 반복문 작성
		for(int i = 1;; i++) {
			if(i % 2 != 0) {
				result += i;
			} else {
				result -= i;
			}
			
			if(result > 100) {
				System.out.println("마지막으로 연산한 숫자 : " + i);
				break;
			}
		}
		
		// 출력
		System.out.println("계산한 결과 : " + result);
	}

}