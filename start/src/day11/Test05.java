package day11;

public class Test05 {

	public Test05() {
		Grand g1 = new Grand();
		Grand g2 = new Father();
		Grand g3 = new Son();
		
		System.out.print("g1.abc() : ");
		g1.abc();
		System.out.print("g2.abc() : ");
		g2.abc();
		System.out.print("g3.abc() : ");
		g3.abc();
		
		System.out.println("g1.no : " + g1.no);		// 함수로 값을 변경하지 않는한 래퍼런스 값
		System.out.println("g2.no : " + g2.no);
		System.out.println("g3.no : " + g3.no);
		
		((Father)g2).xyz();		// 원래 본인 클래스로 형 변환 시키면 가능
		// (Son)g2 같이 하위 클래스로 형 변환을 시키면 에러 남!
		
		// intstanceof 연산자
		System.out.println(g1 instanceof Son);
		System.out.println(g3 instanceof Son);
		System.out.println(g3 instanceof Grand);
		System.out.println((Father)g2 instanceof Grand);
	}
	
	public static void main(String[] args) {
		new Test05();
	}

}


class Grand {
	int no = 80;
	
	void abc() {
		System.out.println("나는 Grand...!");
	}
}

class Father extends Grand {
	int no = 40;
	
	void abc() {
		System.out.println("\t나는 Father...!");
	}
	
	void xyz() {
		System.out.println("**********************");
	}
}

class Son extends Father {
	int no = 10;
	
	void abc() {
		System.out.println("\t나는 Son...!");
	}
	
	void xyz() {
		System.out.println("######################");
	}
}