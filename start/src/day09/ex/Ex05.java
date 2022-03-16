package day09.ex;

import java.util.Arrays;

/*
 	문제 5 ]
 		10 학생의 국어, 영어, 수학 점수를 랜덤하게 입력받아서
 		총점과 석차를 구하는 프로그램을 작성하세요.
 		
 		각 학생의 점수입력, 총점계산, 석차계산, 출력은 함수로 처리하세요.
 */
public class Ex05 {

	public Ex05() {
		int[][] stud = new int[10][5];
		
		getScore(stud);
		getTotal(stud);
		itsOk(stud);
		getRank(stud);
		descending(stud);
		toPrint(stud);
	}
	
	// 국어, 영어, 수학 점수를 랜덤하게 입력받는 함수
	public void getScore(int[][] stud) {
		for(int i = 0 ; i < stud.length ; i++) {
			for(int j = 0 ; j < stud[i].length - 2 ; j++) {
				stud[i][j] = (int)(Math.random() * (100 - 60 + 1) + 60);
			}
		}
	}
	
	// 총점을 구하는 함수
	public void getTotal(int[][] stud) {
		for(int i = 0 ; i < stud.length ; i++) {
			for(int j = 0 ; j < stud[i].length - 2 ; j++) {
				stud[i][stud[i].length - 2] += stud[i][j];
			}
		}
	}
	
	// 점수랑 총점까지 잘 구해졌는지 값을 확인하는 함수
	public void itsOk(int[][] stud) {
		for(int i = 0 ; i < stud.length ; i++) {
			System.out.println(Arrays.toString(stud[i]));
		}
	}
	
	// 총점을 나눠 평균을 내고 석차를 구해서 저장하는 함수
	public void getRank(int[][] stud) {
		for(int i = 0 ; i < stud.length ; i++) {
			stud[i][stud[i].length - 1] = 1;
			for(int j = 0 ; j < stud.length ; j++) {
				if(stud[i][stud[i].length - 2] / (double)(stud[i].length - 2) < stud[j][stud[i].length - 2] / (double)(stud[i].length - 2)) {
					stud[i][stud[i].length - 1]++;
				}
			}
		}
	}
	
	// 석차순으로 학생을 정렬하는 함수
	public void descending(int[][] stud) {
		int[] tmp = new int[5];
		
		for(int i = 0 ; i < stud.length ; i++) {
			for(int j = 0 ; j < stud.length ; j++) {
				if(stud[i][stud[i].length - 1] < stud[j][stud[j].length - 1]) {
					tmp = stud[i];
					stud[i] = stud[j];
					stud[j] = tmp;
				}
			}
		}
	}
	
	// 출력하는 함수
	public void toPrint(int[][] stud) {
		for(int i = 0 ; i < stud.length ; i++) {
			System.out.print((char)('A' + i) + "학생의 국어, 영어, 수학 점수는 ");
			for(int j = 0 ; j < stud[i].length - 2 ; j++) {
				System.out.printf("%3d ", stud[i][j]);
			}
			System.out.printf("이고 총합은 %3d 이고 %2d 등이다.", stud[i][stud[i].length - 2], stud[i][stud[i].length - 1]);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

}
