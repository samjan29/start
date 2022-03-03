package day06.ex;

/*
 	문제 2 ]
 		두 사람이 등산을 한다.
 		한 사람은 산 입구에서 0.54m/sec의 속도로 등산을 시작하고
 		한 사람은 정상에서 1.07m/sec의 속도로 내려온다.
 		산의 높이가 7564m라고 가정하면 두 사람이 만나는 시점은 몇분 몇초 후인지 출력하세요.
 		
 */
public class Ex02 {

	public static void main(String[] args) {
		// 산 높이 정수 변수에 저장
		int height = 7564;
		
		// for 반복문으로 두 사람이 만나는 시점 구하기
		// 몇초 걸리는지 구해 분초로 만들거임
		int i = 1;
		
		// 두 사람의 속도를 변수에 저장
		double a = 0.54, b = 1.07;
		
		for(i = 1 ; ; i++) {
			int result = (int)((a * i) + (b * i));
			
			if(result >= height) {
				break;
			}
		}
		
		// i는 시간을 모두 초로 받은 변수이므로 계산으로 시간 분 초를 구한다.
		int hour = i / (60 * 60);
		int min = (i / 60) % 60;
		int sec = i % 60;
		
		System.out.println("두 사람이 만나는 때는 출발부터 " + hour + "시간 " + min + "분 " + sec + "초 지났을 때이다.");
	}

}
