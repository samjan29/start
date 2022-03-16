package day11;

public class Test01 {
	int no1 = 10;	// ==> 명시적 초기화
	
	int no2;
//	no2 = 100;	// ==> 클래스블록 내에서는 일반 명령이 오면 절대로 안된다.
	{
		no2 = 100;		// ==> 초기화 블록을 이용한 초기화
	}
	
	public Test01() {
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
