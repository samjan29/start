package day10.ex;

/*
 	문제 2 ]
 		다음 변수를 가지는 Student 클래스를 제작하세요.
 		
 		String name;
 		int ban, no, kor, eng, math;
 		
 		클래스를 만들고
 		
 		Ex02 클래스에서 
 			한명의 데이터를 입력해서 출력하기
 			5명의 데이터를 배열로 만들어 데이터 입력하고 출력하고...
 			
 		기능별로 분리해서 함수 만들어서 처리
 		
 		보너스 ]
 			int rank, total;
 			double avg;
 			
 */
public class Ex02 {
	Student[] student;
	int[] ban, no, kor, eng, math;
	
	// 보너스
	int[] rank, total;
	double[] avg;
	
	public Ex02() {
		student = new Student[5]; 
		
		setData();
		setBonus();
		setStudent();
		ascending();
		toPrint();
	}
	
	// 각 배열에 데이터 셋팅하는 함수
	public void setData() {
		ban = new int[5];
		no = new int[5];
		kor = new int[5];
		eng = new int[5];
		math = new int[5];
		
		for(int i = 0 ; i < student.length ; i++) {
			// 배열 칸마다 객체 만들기
			student[i] = new Student();
			
			ban[i] = (int)(Math.random() * (2 - 1 + 1) + 1);
			no[i] = (int)(Math.random() * (10 - 1 + 1) + 1);
			kor[i] = (int)(Math.random() * (100 - 60 + 1) + 60);
			eng[i] = (int)(Math.random() * (100 - 60 + 1) + 60);
			math[i] = (int)(Math.random() * (100 - 60 + 1) + 60);
		}
	}
	
	// 보너스 데이터 셋팅하는 함수
	public void setBonus() {
		total = new int[5];
		avg = new double[5];
		rank = new int[5];
		
		for(int i = 0 ; i < student.length ; i++) {
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / 3.;
			rank[i] = 1;
		}
		
		for(int i = 0 ; i < student.length ; i++) {
			for(int j = 0 ; j < student.length ; j++) {
				if(avg[i] < avg[j]) {
					rank[i] += 1;
				}
			}
		}
	}
	
	// 데이터 가져와서 Student 타입 배열에 저장하는 함수
	public void setStudent() {
		for(int i = 0 ; i < student.length ; i++) {
			
			// student 배열에 데이터 저장
			student[i].setBan(ban[i]);
			student[i].setNo(no[i]);
			student[i].setKor(kor[i]);
			student[i].setEng(eng[i]);
			student[i].setMath(math[i]);
			student[i].setTotal(total[i]);
			student[i].setAvg(avg[i]);
			student[i].setRank(rank[i]);
			
//			System.out.println(student[i]);
		}
	}
	
	// 석차 오름차순으로 정렬하는 함수
	public void ascending() {
		Student tmp = new Student();
		for(int i = 0 ; i < student.length ; i++) {
			for(int j = 0 ; j < student.length ; j++) {
				if(student[i].getRank() < student[j].getRank()) {
					tmp = student[i];
					student[i] = student[j];
					student[j] = tmp;
				}
			}
		}
	}
	
	// 출력해주는 함수
	public void toPrint() {
		for(int i = 0 ; i < student.length ; i++) {
			System.out.print((char)('A' + i) + " 학생은 " + student[i].getBan() + " 반 " + student[i].getNo() +
					" 번이다.\n이 학생의 국어 점수는 " + student[i].getKor() + ", 영어 점수는 " + student[i].getEng() + ", 수학 점수는 " + student[i].getMath() +
					"이고\n총점은 " + student[i].getTotal() + " 이고 평균은 ");
			System.out.printf("%5.2f 이고 석차는 %d 위다.\n", student[i].getAvg(),student[i].getRank());
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
