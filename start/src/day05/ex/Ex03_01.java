package day05.ex;

/*
	 문제 03_01 ]
	 	
	 	0 ~ 255 사이의 정수를 10개를 랜덤하게 만들고
	 	그 정수를 아스키 코드값으로 하는 문자열을 만들어서
	 	만들어진 문자열의 문자를 하나씩 추출해서
	 	추출한 문자가 
	 		대문자인지 소문자인지 특수문자인지를
	 	출력하는 프로그램을 작성하세요.
	 	
	 	참고 ]
	 		문자열의 길이를 알아내는 방법
	 			
	 			int 변수 = 문자열.length();
 */
public class Ex03_01 {

	public static void main(String[] args) {
		// 문자열 변수 선언 초기화
		String str = "";
		
		// 0 ~ 255 사이의 정수를 랜덤하게 발생시켜 문자열 변수에 저장하는 것을 10번 반복하는 반복문
		for(int i = 0 ; i < 10 ; i++) {
			char ch = (char)((int)(Math.random() * (255 - 0 + 1) + 0));
			str += ch;
		}
		
		// 문자열 결과 출력
		System.out.println(str);
		
		// 문자열의 문자를 하나식 추출해 대문자인지 소문자인이 특수문자인지를 출력하는 반복문을 작성
		for(int j = 0 ; j < 10 ; j++) {
			char ch = str.charAt(j);
			
			if(ch >= 'A' && ch <= 'Z') {
				System.out.print(ch + " 이 문자는 알파벳 대문자!\n");
			} else if(ch >= 'a' && ch <= 'z') {
				System.out.print(ch + " 이 문자는 알파벳 소문자!\n");
			} else {
				System.out.print(ch + " 이 문자는 특수문자!\n");
			}
		}
	}

}