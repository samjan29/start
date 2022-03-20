package day14.ex;

/*
 	문제 1 ]
 		원의 정보를 기억할 클래스를 제작하세요.
 		
 			반지름, 면적, 둘레	를 가지고
 		기능은 변수에 접근할 수 있는 함수들
 		
 		반지름이 같으면 같은 원으로 처리해주는 기능의
 			equals() 함수로 오버라이드 하고
 			
 		이 클래스 타입의 변수를 출력하면 해당 원의 정보를 출력해주는 함수도 오버라이드
 */
public class Ex01 {

	public Ex01() {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		
		String result = c1.equals(c2) ? "같은" : "다른";
		
		// 두 원의 정보와, 비교와 결괏값 출력하기
		System.out.println("c1과 c2는 " + result + " 원입니다.");
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
