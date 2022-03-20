package day14.ex;

/*
 	문제 3 ]
 		학생 한명의 성적을 관리하는 클래스 Student 를 작성하세요.
 		기억할 내용은
 			반, 이름, 국어, 영어, 수학, 총점
 		을 기억하도록 하고
 		필요한 기능(함수)는 필요한만큼 추가해주세요.
 		단, 학생의 반과 이름이 같으면 같은 학생으로 처리되도록 하세요.
 		학생 변수를 출력하면 모든 내용이 출력되도록 함수를 오버라이드 하세요.
 */
public class Ex03 {

	public Ex03() {
		// Student 타입의 객체 두개 만들기
		Student stud1 = new Student((int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60));
		Student stud2 = new Student((int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60));
		
		// 각 객체에 반과 이름 넣기
		stud1.setBan(1);
		stud1.setName('A');
		stud2.setBan(1);
		stud2.setName('A');
		
		// 같은지 다른지 문자열을 받을 변수 선언 초기화
		String result = stud1.equals(stud2) ? "같은" : "다른";
		
		System.out.println(stud1.getBan() + " 반의 " + stud1.getName() + " 학생과 " + stud2.getBan() + " 반의 " + stud2.getName() + " 학생은 " + result + " 학생 입니다.");
		System.out.println(stud1);
		System.out.println(stud2);
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
