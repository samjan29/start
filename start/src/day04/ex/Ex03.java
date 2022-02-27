package day04.ex;

/*
 	문제 3 ]
 		게시물을 게시판에 출력하는데 하나의 페이지에 게시물을 15개를 출력할 예정이다.
 		게시물 수를 랜덤하게 발생시켜서 게시판의 페이지가 몇페이지가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
 		랜덤 최대숫자 랜덤으로!
 		
 		참고 ]
 			게시물이 없어도 게시물이 없는 페이지가 적어도 1페이지는 필요하다.
 */
public class Ex03 {
	public static void main(String[] args) {
		// 최대 숫자 100까지 해서 랜덤 숫자 발생해서 할당
		int post = (int)(Math.random() * (100 - 0 + 1) + 0);
		
		// 랜덤으로 나온 게시물 수를 출력
		System.out.println("게시물 수 : " + post);
		
		// 페이지 변수를 선언해서 연산 후 할당
		int totalPage = (int)(post / 15 + 1);
		
		// 총 페이지를 출력
		System.out.println("한 페이지에 15게시물이 들어가는 총 페이지 : " + totalPage);
		
		// 마지막 페이지 변수 선언 후 연산 & 할당
		int lastPagePost = (int)(post % 15);
		
		// 마지막 페이지의 게시물 수 출력
		System.out.println("마지막 페이지의 게시물 수 : " + lastPagePost);
	}
}
