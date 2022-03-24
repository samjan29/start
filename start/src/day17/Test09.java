package day17;

/*
 	파일에 친구의 정보를 저장해보자.
 	정보
 		이름		String
 		나이		int
 		신장		float
 		성별		char
 		전화번호	String
 		메일		String
 		혈액형		String
 		RH			boolean
 */

import java.io.*;

public class Test09 {

	public Test09() {
		// 스트림 준비
		FileOutputStream fout = null;
		DataOutputStream dout = null;
		try {
			fout = new FileOutputStream("src/day17/result/dataoutput.txt");
			dout = new DataOutputStream(fout);
			
			// 데이터 준비
			String name = "감자튀김";
			int age = 99;
			float height = 250.5F;
			char gen = 'P';
			String tel = "010-9999-9999";
			String mail = "pota@tototototo.to";
			String blood = "AB";
			boolean rh = false;		// + : true, - : false
			
			// DataInput/OutputStream의 특징은 자바의 데이터를 변환 없이 사용할 수 없다.
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeFloat(height);
			dout.writeChar(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			dout.writeUTF(blood);
			dout.writeBoolean(rh);
			
			System.out.println("##### 저장 성공 #####");
		} catch(Exception e) {
			
		} finally {
			try {
				dout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
