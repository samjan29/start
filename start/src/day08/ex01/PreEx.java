package day08.ex01;

/*
	다음 내용은 다중 반복문과 2원배열 연습용 문제입니다.
	모두 풀 수 있다면 좋겠지만
	풀지 못하는 문제가 있다 해도 상관없으니
	미진한 부분 연습용으로 활용하시기 바랍니다.
	
	1. 
		1  1  1  1  1
		2  2  2  2  2
		3  3  3  3  3
		4  4  4  4  4
		5  5  5  5  5
		
	2. 
		1  2  3  4  5
		1  2  3  4  5
		1  2  3  4  5
		1  2  3  4  5
		1  2  3  4  5

	3. 
		5  4  3  2  1
		5  4  3  2  1
		5  4  3  2  1
		5  4  3  2  1
		5  4  3  2  1
	
	4.
		1  2  3  4  5
		5  4  3  2  1
		1  2  3  4  5
		5  4  3  2  1
		1  2  3  4  5
		
	5. 
		 1  2  3  4  5
		 6  7  8  9 10
		11 12 13 14 15
		16 17 18 19 20
		21 22 23 24 25
		
	6.
		 1  2  3  4  5
		10  9  8  7  6
		11 12 13 14 15
		20 19 18 17 16
		21 22 23 24 25
		
	7.
		1  0  0  0  0
		1  2  0  0  0
		1  2  3  0  0
		1  2  3  4  0
		1  2  3  4  5
		
	8.
		 1  0  0  0  0
		 2  3  0  0  0
		 4  5  6  0  0
		 7  8  9 10  0
		11 12 13 14 15
		
	9.
		 0  0  0  0  1
		 0  0  0  1  2
		 0  0  1  2  3
		 0  1  2  3  4
		 1  2  3  4  5
		     
	10.
		 0  0  0  0  1
		 0  0  0  2  3
		 0  0  4  5  6
		 0  7  8  9 10
		11 12 13 14 15
 */

public class PreEx {

	public static void main(String[] args) {
		int[][] num = new int[5][5];
		
		/*
	 		1. 
				1  1  1  1  1
				2  2  2  2  2
				3  3  3  3  3
				4  4  4  4  4
				5  5  5  5  5
		 */
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				num[i][j] = i + 1;
			}
		}
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				System.out.print(num[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
	 		2. 
				1  2  3  4  5
				1  2  3  4  5
				1  2  3  4  5
				1  2  3  4  5
				1  2  3  4  5
		 */
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				num[i][j] = j + 1;
			}
		}
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				System.out.print(num[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
	 		3. 
				5  4  3  2  1
				5  4  3  2  1
				5  4  3  2  1
				5  4  3  2  1
				5  4  3  2  1
		 */
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				num[i][j] = num[i].length - j;
			}
		}
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				System.out.print(num[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	4.
				1  2  3  4  5
				5  4  3  2  1
				1  2  3  4  5
				5  4  3  2  1
				1  2  3  4  5
		 */
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				if(i % 2 == 0) {
					num[i][j] = j + 1;
				} else {
					num[i][j] = num[i].length - j;
				}
			}
		}
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				System.out.print(num[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	5. 
				 1  2  3  4  5
				 6  7  8  9 10
				11 12 13 14 15
				16 17 18 19 20
				21 22 23 24 25
		 */
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				num[i][j] = j + 1 + (i * num.length);
			}
		}
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				if(num[i][j] < 10) {
					System.out.print(" " + num[i][j] + " ");
				} else {
					System.out.print(num[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	6.
				 1  2  3  4  5
				10  9  8  7  6
				11 12 13 14 15
				20 19 18 17 16
				21 22 23 24 25
		 */
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				if(i % 2 == 0) {
					num[i][j] = j + 1 + (i * num.length);
				} else {
					num[i][j] = num[i].length - j + (i * num.length);
				}
			}
		}
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				if(num[i][j] < 10) {
					System.out.print(" " + num[i][j] + " ");
				} else {
					System.out.print(num[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	7.
				1  0  0  0  0
				1  2  0  0  0
				1  2  3  0  0
				1  2  3  4  0
				1  2  3  4  5
		 */
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				num[i][j] = j + 1;
				
				if(j > i) {
					num[i][j] = 0;
				}
			}
		}
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				System.out.print(num[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	8.
				 1  0  0  0  0
				 2  3  0  0  0
				 4  5  6  0  0
				 7  8  9 10  0
				11 12 13 14 15
		 */
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				if(i == 0) {
					num[i][j] = 1 + j; 
				} else {
					num[i][j] = num[i - 1][0] + i + j;
				}
				if(j > i) {
					num[i][j] = 0;
				}
			}
		}
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				if(num[i][j] < 10) {
					System.out.print(" " + num[i][j] + " ");
				} else {
					System.out.print(num[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	9.
				 0  0  0  0  1
				 0  0  0  1  2
				 0  0  1  2  3
				 0  1  2  3  4
				 1  2  3  4  5
		 */
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				if(4 - i + j < num[i].length) {
					num[i][4 - i + j] = j + 1;
				} else {
					continue;
				}
				
				if(j < 4 - i) {
					num[i][j] = 0;
				}
			}
		}
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				System.out.print(num[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	10.
				 0  0  0  0  1
				 0  0  0  2  3
				 0  0  4  5  6
				 0  7  8  9 10
				11 12 13 14 15
		 */
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				if(4 - i + j < num[i].length) {
					if(i == 0) {
						num[i][4 - i + j] = 1 + j; 
					} else {
						num[i][4 - i + j] = num[i - 1][4 - i + 1] + i + j;
					}
				} else {
					continue;
				}
				
				if(j < 4 - i) {
					num[i][j] = 0;
				}
			}
		}
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num[i].length ; j++) {
				if(num[i][j] < 10) {
					System.out.print(" " + num[i][j] + " ");
				} else {
					System.out.print(num[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}