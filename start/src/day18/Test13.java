package day18;

public class Test13 {

	public Test13() {
		Sky sky = new Sky();
		Yh yh = new Yh();
		// 일반 클래스 new 시킨 것과 같은 상태
		
		// New Born 상태로 만들어준다.
		Thread t1 = new Thread(sky);
		Thread t2 = new Thread(yh);
		
		// Runnable 상태로 전위
		t1.start();
		t2.start();
		
	}

	public static void main(String[] args) {
		new Test13();
	}

}

class Sky implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println("Sky가 자바를 " + (i + 1) + " 번째 코딩한다.");
			// 한번 출력하면 비록 시간이 남았지만
			// 이번에는 아예 Block 상태로 보낸다.
			// 복귀 시간을 정해서 보낸다.
			try {
				Thread.sleep(1000);		// 복귀 시간은 1초로 한다.
			} catch(Exception e) {}
		}
	}
	
}

class Yh implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println("\t\tYh가 " + (i + 1) + " 번째 복습을 한다.");
			try {
				Thread.sleep(1000); 	// 1초 후 Block 상태에서 Runnable 상태로 전위
			} catch(Exception e) {}
		}
	}
	
}