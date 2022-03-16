package day11;

public class Test07 {
	public Test07() {
		new Grand01();
		System.out.println();
		new Father01();
		System.out.println();
		new Son01();
		System.out.println();
	}
	
	/*
	 	상속 받은 클래스에 super();가 자동 호출 되기 때문에 이렇게 출력 되는 것
	 */

	public static void main(String[] args) {
		new Test07();
	}

}

class Grand01 {
	public Grand01() {
		System.out.println("#  Grand01 생성자");
	}
}

class Father01 extends Grand01{
	public Father01() {
		System.out.println("*** Father01 생성자 ***");
	}
}

class Son01 extends Father01{
	public Son01() {
		System.out.println("$$$$$$$$$$$$$$$$$ Son01 생성자 $$$$$$$$$$$$$$$$$$$$$$$");
	}
}