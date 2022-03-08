package day08.ex;

/*
 	Ex01 ]
	 	
	 	7학생의 5과목 점수를 랜덤하게 만들어서 기억시키고
	 	각 학생 배열의 맨 마지막에는 총점을 계산해서 입력되게 하고
	 	결과를 출력하는데
	 	평균도 계산해서 출력하세요.
 	
 */
public class Ex01 {

	public static void main(String[] args) {
		// 학생 배열
		int[][] stud = new int[7][6];
		
		// 자주 쓰는 데이터를 변수에 저장
		int studLen = stud.length;
		
		// 랜덤 점수 발생시켜 배열에 저장
		for(int i = 0 ; i < studLen ; i++) {
			// 자주 쓰는 지역 변수
			int studILen = stud[i].length;
			
			for(int j = 0 ; j < studILen - 1 ; j++) {
				stud[i][j] = (int)(Math.random() * (100 - 60 + 1) + 60);
				
				// 총점을 계산해 점수 배열 마지막에 저장
				stud[i][studILen - 1] += stud[i][j];				
			}
		}
		
		// 학생 평균 계산해서 평균 배열에 저장 
		double[] average = new double[7];
		for(int i = 0 ; i < studLen ; i++) {
			// 자주 쓰는 지역 변수
			int studILen = stud[i].length;
			
			average[i] = stud[i][studILen - 1] / (double)(studILen - 1);
		}
		
		// 출력
		for(int i = 0; i < studLen ; i++) {
			// 자주 쓰는 지역 변수
			int studILen = stud[i].length;
			
			// 학생이 누군지 알려주는 출력메세지
			System.out.print((char)('A' + i) + " 학생의 점수\n| ");
			
			// 과목 점수들 출력
			for(int j = 0 ; j < studILen - 1 ; j++) {
				System.out.print((char)('a' + j) + " 과목 : " + stud[i][j] + " | ");
			}
			
			// 총점과 평균 출력
			System.out.print("총점 : " + stud[i][studILen - 1] + " / 평균 : " + average[i]);
			
			
			System.out.println();
			System.out.println("*************************************************************************************");
			
		}
	}

}
