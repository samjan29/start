package day05.ex;

/*
	1 부터 정수를 더해갔을때 그합이 5000을 초과하는 수는 몇부터인지 출력하세요.
	
	힌트 ]
		처음 합이 5000이 넘는 순간 반복문을 종료한다.
*/
public class Ex01_01 {

	public static void main(String[] args) {
		// 1부터 정수를 더 하는 무한반복문 만들기
		// 더해서 결과를 저장할 변수 선언
		int total = 0;
		
		// 무한 반복문!
		for(int i = 1 ; ; i++) {
			total += i;
			
			if(total > 5000) {
				System.out.println("마지막으로 더한 숫자 : " + i);
				break;
			}
		}
		System.out.println("5000을 넘은 숫자 : " + total);
	}

}