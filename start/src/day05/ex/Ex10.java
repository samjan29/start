package day05.ex;

/*
	문제 10 ]
		주사위 2개를 던질 경우 눈의 합이 6이 되는 경우를 모두 출력하세요.
 */
public class Ex10 {

	public static void main(String[] args) {
		// 주사위 제일 큰 눈 값
		int diceB = 6;
		
		// 주사위 값을 할당할 변수 두개 선언
		int dice1 = 0, dice2 = 0;
		
		// 두 눈의 합이 6이 되는 경우는 메세지 출력
		System.out.println("두 눈의 합이 6이 되는 경우는?");
		
		// for문으로 주사위 1의 값을 6으로 빼서 주사위 2의 값 구하면 됨
		for(int i = 0; i < diceB - 1; i++) {
			dice1 = i + 1;
			dice2 = diceB - dice1;
			System.out.println("주사위 1 : " + dice1 + " 주사위 2 : " + dice2);
		}
	}

}