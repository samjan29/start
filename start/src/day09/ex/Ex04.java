package day09.ex;

import java.util.Arrays;

/*
 	문제 4 ]
 		1차원 배열에 정수 10개를 입력한 후
 		합계와 평균을 구해주는 프로그램을 작성하세요.
 		
 		배열에 정수를 랜덤하게 채워주는 함수
 		합계를 계산해주는 함수 ; 배열에 담으라고는 안함
 		평균을 계산해주는 함수
 		출력해주는 함수
 */
public class Ex04 {
	int total;
	double avg;
	
	public Ex04() {
		int[] score = new int[10];
		
		// 정수를 랜덤하게 채우기
		getNums(score);
		
		// 합계 계산
		getTotal(score);
		
		// 평균 계산
		getAverage(score);
		
		// 출력
		toPrint(score);
	}
	
	// 배열에 정수 10개를 랜덤하게 채워주는 함수
	void getNums(int[] Nums) {
		for(int i = 0 ; i < Nums.length ; i++) {
			// 1 ~ 100 정수 랜덤하게 10개
			Nums[i] = (int)(Math.random() * (100 - 1 + 1) + 1);
		}
	}
	
	// 합계를 계산해주는 함수
	void getTotal(int[] score) {
		for(int i = 0 ; i < score.length ; i++) {
			total += score[i];
		}
	}
	
	// 평균을 계산해주는 함수
	void getAverage(int[] score) {
		avg = total / (double)(score.length);
	}
	
	// 출력 해주는 함수
	void toPrint(int[] score) {
		System.out.print("랜덤으로 뽑은 10개의 정수\n\t");
		for(int i = 0 ; i < score.length ; i++) {
			if(i == (score.length - 1)) {
				System.out.print(score[i]);
				break;
			}
			System.out.print(score[i] + " , ");
		}
		System.out.println();
		System.out.print("\t의 총합은 " + total + " 이고 평균은 " + avg + " 이다.");
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}
