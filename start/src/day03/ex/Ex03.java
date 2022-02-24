package day03.ex;

/*
 	84232원을 지불하려고 한다.
 	우리나라 화폐 단위로 위 금액을 지불하려면 각 단위가 몇개씩 필요한지 계산해서 출력하세요.
 	
 	화폐 단위
 		50000원
 		10000원
 		5000원
 		1000원
 		500원
 		100원
 		50원
 		10원
 		1원
 		
 */
public class Ex03 {
	public static void main(String[] args) {
		// 선생님이 하신거
		int total = 84232;
		
		int tmp = total;
		
		// 5만원권
		int oman = tmp / 50000;
		//	5만원권 제외한 금액 기억
		tmp = tmp % 50000;
		
		// 1만원권
		int man = tmp /10000;
		// 1만원권 제외한 금액 기억
		tmp = tmp % 10000;
		
		// 5천원권
		int ochun = tmp / 5000;
		// 5천원권 제외한 금액 기억
		tmp = tmp % 5000;
		
		// 1천원권
		int chun = tmp / 1000;
		tmp = tmp % 1000;
		
		// 5백원권
		int obeak = tmp / 500;
		tmp = tmp % 500;
		
		// 1백원권
		int beak = tmp / 100;
		tmp = tmp % 100;
		
		// 50원권
		int oship = tmp / 50;
		tmp = tmp % 50;
		
		// 10원권
		int ship = tmp / 10;
		
		// 1원
		int il = tmp % 10;
		
		System.out.printf("%10s%3d%-4s\n", "총금액 : ", total, " 원은");
		System.out.printf("%9s%3d%-4s\n", "오만원권 : ", oman, " 장");
		System.out.printf("%10s%3d%-4s\n", "만원권 : ", man, " 장");
		System.out.printf("%9s%3d%-4s\n", "오천원권 : ", ochun, " 장");
		System.out.printf("%10s%3d%-4s\n", "천원권 : ", chun, " 장");
		System.out.printf("%9s%3d%-4s\n", "오백원권 : ", obeak, " 장");
		System.out.printf("%10s%3d%-4s\n", "백원권 : ", beak, " 장");
		System.out.printf("%9s%3d%-4s\n", "오십원권 : ", oship, " 장");
		System.out.printf("%10s%3d%-4s\n", "십원권 : ", ship, " 장");
		System.out.printf("%10s%3d%-4s\n", "일원권 : ", il, " 장");
		
		// 내가 다시 만든거!
		
		tmp = total;
		
		int fiveMillon = tmp / 50000;
		tmp %= 50000;
		
		int oneMillon = tmp / 10000;
		tmp %= 10000;
		
		int fiveThousand = tmp / 5000;
		tmp %= 5000;
		
		int oneThousand = tmp / 1000;
		tmp %= 1000;
		
		int fiveHundred = tmp / 500;
		tmp %= 500;
		
		int oneHundred = tmp / 100;
		tmp %= 100;
		
		int fifty = tmp / 50;
		tmp %= 50;
		
		int ten = tmp /10;
		int one = tmp %= 10;
		
		System.out.println("총 금액  : " + total + " 원");
		System.out.println("오만원권 : " + fiveMillon + " 장");
		System.out.println("만원권 	 : " + oneMillon + " 장");
		System.out.println("오천원권 : " + fiveThousand + " 장");
		System.out.println("천원권   : " + oneThousand + " 장");
		System.out.println("오백원권 : " + fiveHundred + " 장");
		System.out.println("백원권   : " + oneHundred + " 장");
		System.out.println("오십원권 : " + fifty + " 장");
		System.out.println("십원권   : " + ten + " 장");
		System.out.println("일원권   : " + one + " 장");
		// 나머지를 뭔지 알게되니까 나누기가 뭔지 까먹은 케이스. 나누기가 몫을 구하는거라는걸 항상 생각하자!
	}
}
