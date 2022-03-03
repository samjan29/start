package day07.ex;

/*
 	5명의 학생의 이름을 기억할 배열을 만들고
 	각 학생의 시험 성적을 기억할 배열을 만들고
 	결과를 출력하는 프로그램을 작성하세요.
 	
 	출력 예 ]
 	
 		둘리 : 80
 		제니 : 90
 		리사 : 85
 		로제 : 75
 		지수 : 100
 		----------
 		총점 : XXX
 		평균 : 00.00
 	
 */
public class Ex04 {

	public static void main(String[] args) {
		// 5명의 학생의 이름을 기억할 문자열 배열 만들기
		String[] name = {"둘리", "제니", "리사", "로제", "지수"};
		
		// 각 학생의 시험 성적을 기억할 정수 배열 만들기
		int[] score = {80, 90, 85, 75, 100};
		
		// 총점을 할당할 변수 선언
		int total = 0;
		
		// 총점을 구하는 반복문
		for(int i = 0 ; i < score.length ; i++) {
			total += score[i];
		}
		
		// 평균 구해서 변수에 저장
		double average = total / (double)score.length;
		
		// 학생 이름과 점수 출력하는 반복문
		for(int i = 0 ; i < name.length ; i++) {
			System.out.println(name[i] + " : " + score[i]);
		}
		
		// 총점과 평균 출력
		System.out.print("----------\n총점 : " + total + "\n평균 : " + average);
	}

}
