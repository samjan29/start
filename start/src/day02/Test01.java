package day02;

/**
 * 	이 클래스는 주석의 형식을 보여주기 위한 클래스
 * @author 감자튀김
 * @since 2022.02.23
 * @version v.1.0
 *
 *	참고 ]
 *			이 주석은 배포문서에 포함되는 주석
 */

public class Test01 {
// System.out.println("test");
	/*
	 	클래스 블록 바로 아래에는 일반명령이 오면 절대로 안된다.
	 	클래스 블록( {} )에 올 수 있는 것은 변수, 함수가 올 수 있다.
	 	
	 	==> 클래스는 변수와 함수로 구성된다.
	 */
	
	// 진입점 함수
	public static void main(String[] args) {
		// 여기는 한줄 주석
		System.out.println("한줄 주석 작성 끝...");
		
		// 다시 한줄 주석	System.out.println("다시 한줄 주석");
		
		/*
		 	여러줄 주석
		 	이 안에서 작성되는 내용은 모두 주석으로 처리된다.
		 	
		 	여러줄 모두 주석으로 처리된다.
		 */
	}
	
}
