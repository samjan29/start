package day16.ex;

/*
 	학생들의 과목점수를 기억하는 HashMap을 만들고
 	다섯 학생의 점수를 저장해서 출력하는 프로그램을 작성하세요.
 	과목은
 		국어, 영어, 수학, 과학, 국사
 	의 점수를 기억하도록 하세요.
 */
import java.util.*;
import java.util.Map.Entry;

public class Ex02 {
	HashMap<String, HashMap<String, Integer>> map = new HashMap<String, HashMap<String, Integer>>();

	public Ex02() {
		// 학생 5명 만들어서 넣기
		for(int i = 0 ; i < 5 ; i++) {
			String name = (char)('A' + i) + "";
			setStudent(name);
		}
		
		for(int i = 0 ; i < map.size() ; i++) {
			String name = (char)('A' + i) + "";
			getStudent(name);
		}
	}
	
	// 학생의 이름이 studMap에 넣어주는 함수
	public void createStudent(String student) {
		// 학생의 이름이 존재하지 않으면
		if(!map.containsKey(student)) {
			map.put(student, new HashMap<String, Integer>());
		}
	}
	
	public void setStudent(String student) {
		// 학생이 기록에 없으면 추가
		createStudent(student);
		
		// Map에서 학생 이름으로 value인 Map 가져오기
		HashMap<String, Integer> subScore = map.get(student);
		
		subScore.put("국어", (int)(Math.random() * 41 + 60));
		subScore.put("영어", (int)(Math.random() * 41 + 60));
		subScore.put("수학", (int)(Math.random() * 41 + 60));
		subScore.put("과학", (int)(Math.random() * 41 + 60));
		subScore.put("국사", (int)(Math.random() * 41 + 60));
	}
	
	public void getStudent(String student) {
 		HashMap<String, Integer> subScore = map.get(student);
		System.out.println(student + "학생");
		
		Set<Entry<String, Integer>> set = subScore.entrySet();
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			
			Object sub = ((Map.Entry)(itor.next())).getKey();
			int score = (int) subScore.get(sub);
			
			System.out.print((String) sub + " : " + score + "점\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
