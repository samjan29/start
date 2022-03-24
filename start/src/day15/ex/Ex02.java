package day15.ex;

/*
 	1 ~ 99 사이의 정수를 랜덤하게 발생시켜서
 	10개를 TreeSet에 입력한 후
 	내림차순으로 정렬해서 출력하세요.
 */
import java.util.*;
public class Ex02 {

	public Ex02() {
		// TreeSet 만들기
		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				result = (int)o1 - (int)o2;
				return -result;
			}
			
		});
		
		// set에 1 ~ 99 사이의 정수 10개를 입력
		while(set.size() <= 10) {
			set.add((int)(Math.random() * (99 - 1 + 1) + 1));
		}
		
		System.out.print("| ");
		Iterator<Integer> itor = set.iterator();
		while(itor.hasNext()) {
			int num = itor.next();
			System.out.print(num + " | ");
		}
		
	}



/*
public class Ex02 {
	
	public Ex02() {
		// 이 경우는 기존 가지고 있는 정렬 기준을 바꾸는 작업이 되기 때문에
		// Comparator를  TreeSet을 만들 때 적용시켜서 만들면 된다.
		TreeSet set = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				
				int no1 = (int) o1;
				int no2 = (int) o2;
				
				result = no1 - no2;
				
				return -result;	// 내림차순
			}
		});
		
		while(true) {
			set.add((int)(Math.random() * 99 + 1));
			if(set.size() == 10) {
				break;
			}
		}
		
		for(Object o : set) {
			System.out.println(o);	// 되도록 아래 방법으로
		}
		/*
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
	}
	 */
	
	
	public static void main(String[] args) {
		new Ex02();
	}
	
}
