package day05.ex;

/*
	문제 14 ]
		다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하세요.
		
		1. 4자리 숫자 abcd는 0이 들어있지 않고, 모두 다른 숫자이다.
		2. 첫번째 숫자(a)가 마지막 숫자(d)보다 2 큼
			a : >= 3
				<= 9
			d : >= 1
				<= 7
		3. 두번째 숫자(b)가 세번째 숫자(c)보다 크다.
			b > c ==> c + 1 부터 시작
		4. 4자리 숫자를 역순으로 하고 그 수와 4자리수를 합하면 16456이 된다.
			a	b	c	d
		+	d	c	b	a
		==> 16456
			a + d = 16
			b + c = 4
			
			
 */
public class Ex14 {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0;
		
		int abcd = 0;
		
		for(int i = 1 ; i < 8 ; i++) {
			d = i;
			a = d + 2;
			if(a + d == 16) {
				a = a * 1000;
				break;
			}
		}
		
		loop:
		for(int j = 1 ; j < 9 ; j++) {
			for(int k = 1 ; k < 9 ; k++) {
				c = j;
				b = c + k;
				if(b + c == 4) {
					b = b * 100;
					c = c * 10;
					break loop;
				}
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		abcd = a + b + c + d;
		
		System.out.println("4자리 숫자 abcd의 값은 " + abcd);
		
	}

}