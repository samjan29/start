package day12;

public class Test01 {
	public Test01() {
		Father f1 = new Son();
//		Son s1 = new Father();		Son이 하위 클래스라 더 크기 때문에 안됨
		
		Father f2 = new Father();
		Son s1 = (Son)f2;	// f2에는 하위 클래스에 있는게 없기 때문에 에러가 난다
		// 되더라도 이렇게 쓰면 안된다
	}

	public static void main(String[] args) {
		new Test01();
	}

}

class Father{
	void abc() {
		System.out.println("############## father ###############");
	}
}

class Son extends Father{
	void abc() {
		System.out.println("************* Son *************");
	}
}