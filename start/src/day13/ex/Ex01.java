package day13.ex;

import java.util.*;

public class Ex01 {
/*
 	String[] arr = {"123", "456", "789", ...};
 	이 배열이 기억하는 숫자형태의 문자열을 정수로 바꾼 데이터들의 합과 평균을 구하는 프로그램을 작성하세요.
 	
 	단, 발생할 수 있는 예외를 가정하여 모두 처리하세요.
 		1. 배열의 범위를 벗어나서 사용하는 경우
 		2. 숫자로 변환이 불가능한 경우
 		3. 평균을 계산하는데 0으로 나누는 경우
 		4. 위의 세가지 이외의 경우(Exception)
 */
	int total;
	double avg;
	
	Scanner sc = new Scanner(System.in);		// 객체 만들 때 new 시키는거 잊지말기 Scanner도 클래스임!
	
	public Ex01() {
		String[] arr = new String[(int)(Math.random() * (10 - 0 + 1) + 0)];
		
		setArr(arr);
		toPrint(arr);
	}
	
	public void setArr(String[] arr) {
		try {
			// 문자열을 입력받아 배열에 넣기
			System.out.println("아무거나 " + arr.length + "번 입력하세요 : ");
			for(int i = 0 ; i < arr.length ; i++) {
				arr[i] = sc.nextLine();
			}
			
			// 각 문자열들을 숫자로 변환해서 total에 더하기
			total = 0;
			for(int i = 0 ; i < arr.length ; i++) {
				total += Integer.parseInt(arr[i]);
			}
			
			// total을 arr.length로 나눠 avg에 저장
			avg = (double)total / arr.length;
		} catch(IndexOutOfBoundsException e) {
			System.out.println("ERROR !! 배열의 길이를 초과했습니다!");
		} catch(NumberFormatException e) {
			System.out.println("ERROR !! 입력된 값이 숫자가 아닙니다!");
		} catch(ArithmeticException e) {
			System.out.println("ERROR !! 0으로 나눌 수 없습니다!");
		} catch(Exception e) {
			System.out.println("ERROR !! 뭔가 문제가 있습니다!");
		}
	}
	
	public void toPrint(String[] arr) {
		System.out.println("배열에 담긴 숫자");
		System.out.print("| ");
		for(String str : arr) {
			System.out.print(str + " | ");
		}
		System.out.println();
		System.out.println("총 합 : " + total + " ## 평균 : " + avg);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
