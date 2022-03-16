package day11;

public class Test00_02 {
	Nemo[] sagak;
	
	public Test00_02() {
		// sagak 변수에 네모배열을 만들어서 네모객체가 채워지도록 해준다.
		setSagak();
		
		toPrint();
	}
	
	// sagak 세팅해주는 함수
	public void setSagak() {
		// 배열 만들고
		sagak = new Nemo[5];	// ==> 네모객체를 채울 수 있는 공간만 확보한 상태
		// 배열에 네모객체 채워주고
		for(int i = 0 ; i < sagak.length ; i++) {
			sagak[i] = new Nemo((int)(Math.random() * (25 - 5 + 1) + 5), (int)(Math.random() * (25 - 5 + 1) + 5));
		}
	}
	
	// sagak 배열의 내용을 출력해주는 함수
	public void toPrint() {
		/*
		 	이 함수는 sagak 변수에 기억된 배열에 접근해서
		 	배열 안에 기억된 네모 객체를 하나씩 꺼내서
		 	꺼낸 네모객체의 정보를 출력해주는 기능의 함수
		 */
		for(int i = 0 ; i < 5 ; i++) {
			Nemo n = sagak[i];		// 이 부분 다시 공부할것
			
			int garo = n.getGaro();
			int sero = n.getSero();
			int area = n.getArea();
			
			// 출력
			System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d 이고 넓이는 %4d 입니다.", garo, sero, area);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Test00_02();
	}

}
