package day10.ex;

/*
 	문제 1 ]
 		다음 변수를 가지는 Student 클래스를 제작하세요.
 		
 		String name;
 		int ban, no, kor, eng, math;
 		
 		클래스를 만들고
 		
 		Ex01 클래스에서 
 			한명의 데이터를 입력해서 출력하기
 			5명의 데이터를 배열로 만들어 데이터 입력하고 출력하고...
 			
 		한개의 함수내에서 처리하기
 		
 		보너스 ]
 			int rank, total;
 			double avg;
 		
 */
public class Ex01 {
	// 한개의 함수로 처리하기 배열
	Student[] student = new Student[5];
	
	public Ex01() {
		allInOne();
	}
	
	public void allInOne() {
		for(int i = 0 ; i < student.length ; i++) {
			student[i] = new Student();
			// 반은 1반 아니면 2반
			student[i].setBan((int)(Math.random() * (2 - 1 + 1) + 1));
			// 번호는 1 ~ 10
			student[i].setNo((int)(Math.random() * (10 - 1 + 1) + 1));
			// 국영수 점수 60 ~ 100점 사이 
			student[i].setKor((int)(Math.random() * (100 - 60 + 1) + 60));
			student[i].setEng((int)(Math.random() * (100 - 60 + 1) + 60));
			student[i].setMath((int)(Math.random() * (100 - 60 + 1) + 60));
			// 총점
			student[i].setTotal(student[i].getKor() + student[i].getEng() + student[i].getMath());
			// 평균 구하기
			student[i].setAvg(student[i].getTotal() / 3.);
		}
		
		// 석차 구하기
		for(int i = 0 ; i < student.length ; i++) {
			for(int j = 0 ; j < student.length ; j++) {
				int one = student[i].getRank();
				if(student[i].getAvg() < student[j].getAvg()) {
					student[i].setRank(one + 1);
				}
			}
		}
		
		// 출력
		for(int i = 0 ; i < student.length ; i++) {
			System.out.print((char)('A' + i) + " 학생은 " + student[i].getBan() + " 반 " + student[i].getNo() +
					" 번이다.\n이 학생의 국어 점수는 " + student[i].getKor() + ", 영어 점수는 " + student[i].getEng() + ", 수학 점수는 " + student[i].getMath() +
					"이고\n총점은 " + student[i].getTotal() + " 이고 평균은 ");
			System.out.printf("%5.2f 이고 석차는 %d 위다.\n", student[i].getAvg(),student[i].getRank());
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
