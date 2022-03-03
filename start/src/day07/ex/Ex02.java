package day07.ex;

import java.util.Arrays;

/*
 	Ex02 ]
 		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
 		을 준비하고
 		
 		79456원을 coin에 기억된 화폐단위로 지불하려고 할 때 각각의 단위가 몇장씩 필요한지
 		배열에 기억시켜서
 		배열의 내용을 출력하세요.
 		
 		출력 예 ]
 			
 			10000	: 7
 			5000	: 1
 			...
 			1		: 6
 */
public class Ex02 {

	public static void main(String[] args) {
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		//				0		1	2	3		4	5	6	7
		int money = 79456;
		
		// 단위를 저장할 정수 배열
		int[] count = new int[coin.length];
		
		// 단위 구해서 단위 배열에 저장
		for(int i = coin.length - 1 ; i >= 0 ; i--) {
			
			if(i == coin.length - 1) {			// i == 7일때
				count[i] = money % 10;
				money /= 10;
				
			} else if(i % 2 == 0 && i != 0) {	// 짝수이면서 0이 아닐때
				count[i] = money % 10;
				
				if(count[i] >= 5) {					// 짝수인데 값이 5 이상일때
					count[i] -= 5;
					count[i - 1] = 1;
				}
				
			} else if(i % 2 != 0) {				// 홀수일때
				money /= 10;
			} else {							// 0일때
				count[i] = money;
			}
		}
		
		System.out.println(Arrays.toString(count));
		
		// 출력!
		for(int i = 0 ; i < coin.length ; i++) {
			System.out.println(coin[i] + " : " + count[i]);
		}
	}

}
