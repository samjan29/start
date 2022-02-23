package day01;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("내가 만든 첫번째 자바 클래스!!!");
		
		Test01.abc(); 		// .으로 소속을 구분 Test01 클래스에 있는 abc()를 실행하세요.
		
		/*
		 static 없이 메모리에 올리려면
		 Test01 t1 = new Test01();
		 t1.abc();
		 */
	}
	
	public static void abc() {}
	
	public static void xyz() {}
	// 실행은 CTRL + SHIFT + F11 키를 동시에 눌러서
	// class 이름 시작은 대문자로
	
	// static 멤버는 static 영역(메모리)에 클래스가 실행되는 순간 먼저 올려짐
	// static 멤버 안에서는 static 멤버만 호출 가능하기 때문에 아닌 경우는 new를 써서 올려야함.
}
