package day07.ex;

/*
 	반지름 5개를 기억하는 배열을 만들고
 	랜덤하게 반지름을 만들어서 기억시키고
 	각각의 원의 넓이를 계산해서 출력해주는 프로그램을 작성하세요.
 	넓이도 배열에 기억시켜주세요.
 */
public class Ex03 {

	public static void main(String[] args) {
		double pi = 3.14;
		
		// 반지름 5개를 저장할 배열
		int[] radius = new int[5];
		
		// 각각의 넓이를 저장할 배열
		double[] area = new double[radius.length];
		
		// 랜덤하게 반지름 만들어서 배열에 저장할 반복문	1 ~ 20 에서 반지름 랜덤 생성함
		for(int i = 0 ; i < radius.length ; i++) {
			radius[i] = (int)(Math.random() * (20 - 1 + 1) + 1);
		}
		
		// 각각의 원의 넓이를 계산해서 넓이 배열에 저장할 반복문
		for(int i = 0 ; i < radius.length ; i++) {
			area[i] = radius[i] * radius[i] *pi;
		}
		
		// 출력
		for(int i = 0 ; i < radius.length ; i++) {
			System.out.println((i + 1) + ") 반지름이 " + radius[i] + " 인 원의 넓이는 " + area[i]);
		}
	}

}
