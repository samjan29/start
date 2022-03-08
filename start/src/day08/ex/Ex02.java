package day08.ex;

/*
	Ex02 ]
		Ex01에서 만든 배열의 내용을
		5과목의 7학생의 배열로 바꿔서 해결하세요.
		과목 총점, 학생 총점도 만들기
		평균 계산도 하기
		
	bonus ]
		Ex01의 각 학생의 항목에 석차도 입력되도록 하세요.
		그후 내림차순 정렬하세요.
 */

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		// 5과목의 7학생의 배열
		int[][] subj = new int[6][8];
		
		// 랜덤 점수 만들어서 배열에 넣기! 각 배열의 마지막은 총점의 자리이므로 array.length - 1 해주기!
		for(int i = 0 ; i < subj.length - 1 ; i++) {
			
			for(int j = 0 ; j < subj[i].length - 1 ; j++) {
				subj[i][j] = (int)(Math.random() * (100 - 60 + 1) + 60);
			}
		}
		
		// 과목 총점, 학생 총점 계산해서 각 배열의 마지막에 넣기
		for(int i = 0 ; i < subj.length - 1 ; i++) {
			
			for(int j = 0 ; j < subj[i].length - 1 ; j++) {
				// 과목 총점
				subj[i][subj[i].length - 1] += subj[i][j];
				
				// 학생 총점
				subj[subj.length - 1][j] += subj[i][j];
			}
			
			System.out.println(Arrays.toString(subj[i]));
		}
		
		System.out.println(Arrays.toString(subj[subj.length - 1]));
		System.out.println();
		
		// 평균 계산
		// 과목 평균 배열 만들기
		double[] subjAvg = new double[5];
		// 학생 평균 배열 만들기
		double[] stdAvg = new double[7];
		
		for(int i = 0 ; i < subj.length - 1 ; i++) {
			
			for(int j = 0 ; j < subj[i].length - 1 ; j++) {
				// 과목 평균
				subjAvg[i] = subj[i][subj[i].length - 1] / (double)(subj[i].length - 1);
				
				// 학생 평균
				stdAvg[j] = subj[subj.length - 1][j] / (double)(subj.length - 1);
			}
		}	
		
		// 평균 출력
		// 과목 평균
		System.out.print("| ");
		for(int i = 0 ; i < subjAvg.length ; i++) {
			System.out.print((char)('a' + i) + "과목 평균 : ");
			System.out.printf("%.1f | ", subjAvg[i]);
		}
		// 학생 평균
		System.out.println();
		System.out.print("| ");
		for(int i = 0 ; i < stdAvg.length ; i++) {
			System.out.print((char)('A' + i) + "학생 평균 : " + stdAvg[i] + " | ");
		}
		
		// 내림차순 정렬
		// 학생을 성적 내림차순으로 저장할 문자 배열
		char[] std = new char[7];
		for(int i = 0 ; i < std.length ; i++) {
			std[i] = (char)('A' + i);
		}
		// 학생 평균을 비교해서 문자 배열 내림차순으로 정렬
		for(int i = 0 ; i < stdAvg.length ; i++) {
			double numTmp;
			char chTmp;
			
			for(int j = 0 ; j < stdAvg.length ; j++) {
				if(stdAvg[i] > stdAvg[j]) {		// 내림차순 이 반대가 오름차순 왜인지 알거 같다가도 모르겠음
					numTmp = stdAvg[i];
					stdAvg[i] = stdAvg[j];
					stdAvg[j] = numTmp;
					chTmp = std[i];
					std[i] = std[j];
					std[j] = chTmp;
				}
			}
		}
		
		System.out.println();
		
		// 석차 출력
		System.out.print("\t|  ");
		for(int i = 0 ; i < std.length ; i++) {
			System.out.print((i + 1) + "위 " + std[i] + "학생  |  ");
		}
		
	}

}
