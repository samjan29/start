package day08;

import java.util.Arrays;

/*
 	얕은 복사의 특징
 		Heap 영역에 있는 데이터는 프로그램이 종료할 때까지 살아남는다.
 */
public class Test03 {
	int[] no;
	
	public void setNo() {
		no = new int[5];
		for(int i = 0 ; i < no.length ; i++) {
			no[i] = (int)(Math.random() * 99 + 1);
		}
	}

	public static void main(String[] args) {
		int[] a;	// 배열의 주소를 기억할 변수
		
		{
			int[] b;
			// b 변수는 블록 안에서 만들어진 변수이므로 블록을 벗어나면 사라지는 변수
			b = new int[5];
			// new 라는 명령으로 Heap에 배열을 만들고
			// 변수에 기억시켰지만 이 영역이 닫히는 순간
			// 이 변수는 사라지게 되므로 더 이상 이 배열을 사용할 수 없게 된다.
			
			b[2] = 500;
			
			// 얕은 복사를 한다.
			System.out.println("b[2] : " + b[2]);
			a = b;
			
			a[2] = 1000;									// 복사가 되서 a에 들어가는게 아니라 둘이 저장소 주소를 공유한다.
			System.out.println("b[2] : " + b[2]);			// 따라서 a에서 값을 변경했기 때문에 b에서도 값이 바뀐다.
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
