package day06.ex;

/*
 	문제 4 ]
 		
 		다음 형태로 출력하세요.
 		
*****
*****
*****
*****
*****


*****
****
***
**
*


    *
   **
  ***
 ****
*****


  *
 ***
*****


 */
public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 	*****
			*****
			*****
			*****
			*****
		 */
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = 0 ; i < 5 ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	*****
			****
			***
			**
			*
		 */
		for(int j = 0; j < 5 ; j++) {
			for(int i = 0 ; i < 5 - j ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	    *
			   **
			  ***
			 ****
			*****
		 */
		for(int j = 1 ; j < 6 ; j++) {
			for(int i = 0 ; i < 5 - j ; i++) {
				System.out.print(" ");
			}
			
			for(int i = 0 ; i < j ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 	  *
			 ***
			*****
		 */
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 2 ; j > i ; j--) {
				System.out.print(" ");
			}
			
			for(int j = 0 ; j < (2 * i) + 1 ; j++) {
				System.out.print("*");
			}
			
			for(int j = 2 ; j > i ; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
