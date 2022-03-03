package day07;

/*
 	5과목의 점수를 기억할 배열을 만들고 과목 점수를 입력해서 총점과 평균을 구하고 출력하세요.
 	배열에 담긴 점수도 같이 출력하세요.
 */

import java.util.*;

public class Test04 {

	public static void main(String[] args) {
		// 과목점수 배열
		int[] subj = new int[5];
		
		// 과목점수를 랜덤하게 만들어서 입력한다.
		for(int i = 0 ; i < subj.length ; i++) {
			// 랜덤하게 만든 점수를 각 과목방에 입력한다.
			subj[i] = (int)(Math.random() * (100 - 60 + 1) + 60);	// 60 ~ 100 사이의 정수
		}
		
		// 총점을 계산한다.
		int total = 0;
		for(int i = 0 ; i < subj.length ; i++) {
			total += subj[i];
		}
		
		// 평균 계산
		double avg = total / (double)(subj.length);		// 나중에 형 변환 하면 정수 값에 .0만 붙어서 나오기 때문
		
		// 출력
		System.out.println("각 과목 점수 : " + Arrays.toString(subj));
		System.out.println("과목 총 점수 : " + total);
		System.out.println("과목평균 점수 : " + avg);
	}

}
