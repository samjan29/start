package day07.ex;

import java.util.Arrays;

/*
 	Ex01 ]
 		'A' - 'J' 까지의 문자를 랜덤하게 100개를 만들고
 		각 문자의 **출현횟수를 기억할 배열**을 만들어서
 		횟수만큼 '*' 로 출력해주는 프로그램을 작성하세요.
 		
 		예 ]
 			A [5] : *****
 			B [20] : ********************
 			
 			...
 			
 			J [7] : *******
 */
public class Ex01 {

	public static void main(String[] args) {
		// 문자의 출현횟수를 기억할 배열 만들기   A ~ J까지는 10개
		int[] count = new int[10];
		
		// 'A' - 'J' 랜덤하게 100개 만들기
		for(int i = 0 ; i < 100 ; i++) {
			int random = (int)(Math.random() * ('J' - 'A' + 1) + 'A');
			int a = (int)'A';
			
			// 횟수를 배열에 저장하기
			count[random - a] += 1;
		}
		
		// 배열에 저장된 숫자만큼 *을 출력하기
		for(int i = 0 ; i < count.length ; i++) {
			char ch = (char)('A' + i);
			
			System.out.print(ch + " [" + count[i] + "] : ");
			
			for(int j = 0 ; j < count[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
