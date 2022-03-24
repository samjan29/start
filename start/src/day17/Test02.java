package day17;

import java.io.*;
/*
 	이전 예제에서 만든 파일(FileTest01.txt)을 읽어보자.
 */
public class Test02 {

	public Test02() {
		// 작업 순서
		// 1. 파일로 연결된 스트림을 준비한다.
		FileInputStream fin = null;
		/*
		try {
			// 스트림 연결하고
			fin = new FileInputStream("src/day17/result/FileTest01.txt");	// 프로젝트 기준 경로
			// 2. 한글자만 읽는다.
			int ch = fin.read();
			// 3. 출력한다.
			System.out.println("읽은 문자 : " + (char)ch);
			
			// 여러글자를 읽는다.
			byte[] buff = new byte[10];
			int len = fin.read(buff);
			// byte 배열을 문자열로 변환한다.
			String str = new String(buff, 0, len);
			System.out.println("읽은 문자 : " + str);
			
			// Test01.java 파일을 읽어서 출력해보자.
			// 몇글자를 읽어야 할지 모르므로 반복해서 처리한다.
			// 더 이상 읽은 내용이 없을 때까지 반복해서 처리하면 된다.
			// int read(byte[] b)	함수의 반환값이 -1을 반환해주면 없는 경우
			// 따라서 함수 실행의 반환값이 -1이 될때까지 반복해서 처리하면 된다.
			fin = new FileInputStream("src/day17/Test01.java");
			while(true) {
				// byte[] 준비하고
				byte[] buff = new byte[1024];
				// 데이터를 읽는다.
				int len = fin.read(buff);
				if(len == -1) {
					// 이 경우는 읽어온 데이터가 없는 경우이므로 반복실행을 즉시 종료시킨다.
					break;
				}
				
				// 읽은 byte 배열을 문자열로 변환해서 출력한다.
				String str = new String(buff, 0, len);
				// 출력한다.
				System.out.print(str);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch(Exception e) {}
		}
		*/
		
		FileReader fr = null;
		// 예외처리
		try {
			fr = new FileReader("src/day17/Test01.java");
			while(true) {
				char[] cbuf = new char[512];
				int len = fr.read(cbuf);	// 길이를 가져옴
				if(len == -1) {
					// 읽은 문자가 없을 경우
					break;
				}
				
				String str = new String(cbuf, 0, len);
				System.out.print(str);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
