package day18;

public class Test12 {

	public Test12() {
		PotatoClass pota = new PotatoClass();
		FriedClass fri = new FriedClass();
		// New Born 상태가 됐다.
		
		
		pota.start();
		fri.start();
	}

	public static void main(String[] args) {
		new Test12();
	}

}

class PotatoClass extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("Potato 가 " + (i + 1) + " 번째 노래를 한다.");
			/*
			 	한곡을 노래했으니
			 	다른 프로그램에 양보하세요.
			 	즉, Runnable 상태로 전위하세요.
			 */
			yield();
		}
	}
}

class FriedClass extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("\t\t튀김이 " + (i + 1) + " 번째 노래를 한다.");
			yield();
		}
	}
}
