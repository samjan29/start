package day06.ex;

/*
 	문제 3 ]
 	중첩된 for 명령을 사용해서 처리하세요.
 		
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 


1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5


1 2 3 4 5
2 3 4 5 6 
3 4 5 6 7
4 5 6 7 8 
5 6 7 8 9 


 1  2  3  4  5
 6  7  8  9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25


1
1 2
1 2 3
1 2 3 4
1 2 3 4 5


 1
 2  3
 4  5  6
 7  8  9 10
11 12 13 14 15
 */
public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 	1 1 1 1 1 
			2 2 2 2 2 
			3 3 3 3 3 
			4 4 4 4 4 
			5 5 5 5 5 
		 */
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = 0 ; i < 5 ; i++) {
				System.out.print((j + 1) + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
		 */
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = 0 ; i < 5 ; i++) {
				System.out.print((i + 1) + " ");
			}
			System.out.println();
		}

		System.out.println();	
		System.out.println();
		
		/*
		 	1 2 3 4 5
			2 3 4 5 6 
			3 4 5 6 7
			4 5 6 7 8 
			5 6 7 8 9 
		 */
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = 0 ; i < 5 ; i++) {
				System.out.print((i + 1 + j) + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	 1  2  3  4  5
			 6  7  8  9 10
			11 12 13 14 15
			16 17 18 19 20
			21 22 23 24 25
		 */
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = 0 ; i < 5 ; i++) {
				if(i + 1 + (5 * j) < 10) {
					System.out.print(" " + (i + 1 + (5 * j)) + " ");
				} else {
					System.out.print((i + 1 + (5 * j)) + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();

		/*
		 	1
			1 2
			1 2 3
			1 2 3 4
			1 2 3 4 5
		 */
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = 0 ; i < j + 1 ; i++) {
				System.out.print((i + 1) + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	 1
			 2  3
			 4  5  6
			 7  8  9 10
			11 12 13 14 15
		 */
		int a = 0;
		for(int j = 1 ; j < 6 ; j++) {
			for(int i = 1 ; i < j + 1 ; i++) {
				if((i + a) < 10) {
					System.out.print(" " + (i + a) + " ");
				} else {
					System.out.print((i + a) + " ");
				}
			}
			a += j;
			System.out.println();
		}
	}

}
