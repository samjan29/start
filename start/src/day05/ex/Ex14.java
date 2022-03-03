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
			
			
 */
public class Ex14 {

	public static void main(String[] args) {
		/*
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
			
			나 진짜 억지로 풀었다 이게 먼소리야 나 왜 풀었냐
		*/	
		
		// 선생님 풀이
		int a, b, c, d;
		int result = 0;
		
		loop:
		for(a = 3 ; a <= 9 ; a++) {		// a가 d보다 2보다 크고 숫자들은 0보다 크기 때문에 a는 3부터 시작
			d = a - 2;
			
			for(b = 2 ; b < 10 ; b++) {		// b > c :: c보단 무조건 크기 때문에 2부터
				
				if(b == a || b == d) {
					continue;
					// 이 경우는 같은 숫자가 발생하는 경우므로 조건에 맞지 않으므로 다음 번호를 추출해서 다른 조건을 비교해야 한다.
				}
				
				// 이 라인을 실행하는 경우는 b가 a, d와 같지 않은 경우이다
				
				for(c = 1 ; c < 9 ; c++) {		// (c = b - 1 ; c > 0 ; c--)
					if(c >= b) {				// (c = 1 ; c < b ; c++) 이 두개로 반복문을 작성하면 if(c >= b) 조건문이 없어도 됨
						break;
						// 이 회차 포함 이후 회차는 모두 c >= b 경우라서 조건에 위배되므로 작업을 진행할 필요가 없게 된다.
					}
					
					if(c == a || c == d) {
						continue;
					}
					
					// 이 행을 실행하는 순간은 필요한 숫자가 모두 만들어졌다. 단지 마지막 조건에 맞는지 검사해주면 된다.
					
					int no1 = a * 1000 + b * 100 + c * 10 + d;
					int no2 = d * 1000 + c * 100 + b * 10 + a;
					
					if(no1 + no2 == 16456) {
						// 이 경우는 모든 조건에 맞는 경우이므로 우리가 원하는 숫자가 만들어졌다.
						result = no1;
						
						break loop;
					}
				}
			}
		}
		
		// 결과 출력
		System.out.println("찾는 숫자는 " + result + " 입니다.");
	}

}