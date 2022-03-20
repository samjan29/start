package day14.ex;

/*
 	문제 2 ]
 		사각형의 정보를 기억하는 클래스 Nemo를 제작하세요.
 		필요한 변수와 함수, 생성자는 필요한만큼 추가하고
 		단, 가로와 세로가 동시에 같은 사각형만 같은 사각형으로 처리가 되도록
 		equals() 함수를 오버라이드하세요.
 		이 클래스 객체를 출력하면 내용이 출력되도록 toString() 함수를 오버라이드
 */
public class Ex02 {

	public Ex02() {
		// Nemo 객체 2개 만들기
		Nemo n1 = new Nemo(5, 8);
		Nemo n2 = new Nemo(5, 8);
		
		// 두 사각형을 비교해 같은지 다른지를 출력할 String 변수 선언해 초기화
		String result = n1.equals(n2) ? "같은" : "다른";
		
		System.out.println("n1과 n2는 " + result + " 사각형이다.");
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
