package day16.ex;

/*
 	5 ~ 10 사이의 정수를 랜덤하게 발생시켜서
 	그 수만큼의 학생의 점수를 기억하는 HashMap을 만들어서 데이터를 기억시키고
 	꺼내서 출력하세요.
 	
 	데이터를 꺼낼 때 키를 모두 추출해서 꺼내는 방식으로 출력하세요.
 */

import java.util.*;

public class Ex01 {
	HashMap map = new HashMap();

	public Ex01() {
		setStudents();
		toPrint();
	}
	
	// HashMap에 5 ~ 10 횟수만큼 key랑 data를 할당하는 함수
	public void setStudents() {
		int num = (int)(Math.random() * (10 - 5 + 1) + 5);
		for(int i = 0 ; i < num ; i++) {
			map.put((char)('A' + i), (int)(Math.random() * (100 - 60 + 1) + 60));
		}
	}
	
	public void toPrint() {
		Set set = map.keySet();
		for(Object o : set) {
			char key = (char) o;
			int value = (int) map.get(o);
			
			System.out.println(key + "학생의 점수 : " + value);
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
