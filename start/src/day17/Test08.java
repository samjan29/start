package day17;

/*
 	파일에 내용을 저장하는 프로그램을 작성하세요.
 	단, BufferedStream을 사용하세요.
 */

import java.io.*;

public class Test08 {

	public Test08() {
		// 1. 반드시 장치에는 기본 스트림이 연결되어야 한다.
//		FileOutputStream fout = null;
		FileWriter fw = null;
		// 2. 필요에 따라서 보조(필터) 스트림을 연결할 수 있다.
//		BufferedOutputStream bout = null;
		BufferedWriter bw = null;
		try {
//			fout = new FileOutputStream("src/day17/result/bufferTest01.txt");	// 타켓(기본) 스트림 만들고
			fw = new FileWriter("src/day17/result/bufferTest0101.txt");
//			bout = new BufferedOutputStream(fw);		// 필터(보조) 스트림을 타켓 스트림을 fout을 연결
			bw = new BufferedWriter(fw);
			
			// 내용 만들고
			String str ="Make 'em whistle like a missile, bomb, bomb";
			// 내용을 byte 배열로 변환하고 
//			byte[] buff = str.getBytes();
			char[] cbuf = str.toCharArray();
			// 데이터를 보조 스트림에 써준다.
//			bout.write(buff);
			bw.write(cbuf);
			/*
			 	아직 버퍼가 채워지지 않았으므로 버퍼의 내용이 fout으로 전달되지 않는다.
			 	따라서 저장이 되지 않는다.
			 	
			 	반드시 습관적으로 작업이 완료된 시점에서 버퍼를 비워줘야 한다.
			 */
//			bout.flush();
			bw.flush();
			
			System.out.println("***** 작업 완료 *****");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
//				bout.close();	
//				fout.close();		// 순서 조심 타겟 스트림을 먼저 열였으니 나중에 닫아줘야함
				bw.close();
				fw.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
