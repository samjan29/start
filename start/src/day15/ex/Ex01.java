package day15.ex;

/*
 	Ex01 ]
 		아이디를 입력받아서
 		입력받은 아이디가 유효한 아이디인지 아닌지를 판별해주는 프로그램을 작성하세요.
 		
 		아이디는
 			첫글자는 영문대문자로
 			두번째는 영문숫자를 사용할 수 있다.
 			글자수는 5글자 이상이어야 한다.
 */

import java.util.*;
import java.util.regex.*;

public class Ex01 {
	// 입력도구 준비
	Scanner sc = new Scanner(System.in);

	public Ex01() {
		System.out.print("ID를 입력하세요 : ");
		String id = sc.nextLine();
		
		toPrint(id);
	}

	// id를 입력 받아 유효한 값인지 판별하는 함수
	public boolean matchID(String id) {
		// 패턴을 정의
		Pattern form = Pattern.compile("[A-Z][a-z0-9]{4,}");
		// 검사
		Matcher mat = form.matcher(id);
		// 결과를 받기
		return mat.matches();
	}
	
	// 결과를 출력하는 함수
	public void toPrint(String id) {
		String result = matchID(id) ? "올바른" : "잘못된";
		System.out.println(id + " 은(는) " + result + " ID 입니다.");
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
