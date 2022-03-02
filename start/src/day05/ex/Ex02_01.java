package day05.ex;

/*
	Ex02_01 ]
		3 ~ 10 사이의 정수를 랜덤하게 발생시켜서
		그 정수를 길이로 하는 영어 단어를 랜덤하게 만드세요.
		단, 시작문자는 대문자로 하고 나머지는 소문자로 하세요.
 */
public class Ex02_01 {

	public static void main(String[] args) {
		// 3 ~ 10 사이의 정수를 랜덤하게 발생시켜 변수에 할당
		int len = (int)(Math.random() * (10 - 3 + 1) + 3);
		
		// 시작문자가 대문자고 랜덤으로 나온 단어 길이의 -1만큼 소문자를 반복문으로 만들어 문자열 변수에 저장
		// 문자열 변수 선언 초기화
		String word = "";
		
		// 시작문자 랜덤으로 발생시켜 문자열 변수에 저장
		int bigA = (int)(Math.random() * ('Z' - 'A' + 1) + 'A');
		word = (char)bigA + "";
		
		for(int i = 0 ; i < len -1 ; i++) {
			int smallA = (int)(Math.random() * ('z' - 'a' + 1) + 'a');
			word += (char)smallA + "";
		}
		
		// 만들어진 단어 출력
		System.out.println("단어의 길이 : " + len);
		System.out.println("만들어진 단어 : " + word);
	}

}