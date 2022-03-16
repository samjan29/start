package day12;

import java.util.*;

public class Test04 {
	
	public Test04() {
//		Calendar cal = new Calendar();	==> 이 클래스는 추상 클래스로 new 시켜서 객체를 만들 수 없는 클래스
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
	}
	
	public static void main(String[] args) {	// 문자열 배열 안써놓고 왜 안되지 하고있었음 메인 함수 며칠 안썼다고 이런 문제를
		new Test04();							// 다시는 까먹지 말자
	}
}
