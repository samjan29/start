package day18;

import java.io.*;
/*
 	Test06	에서 저장한 potato.txt 파일을 읽어보자.
 	
 	ObjectOutputStream으로 저장한 (내보낸) 파일은
 	반드시 ObjectInputStream으로 읽어야 한다.
 	그리고 보내는 쪽과 받는 쪽에 모두 동일한 클래스가 있어야 한다.
 */
public class Test07 {

	public Test07() {
		// 기본스트림
		FileInputStream fin = null;
		// 보조스트림
		ObjectInputStream oin = null;
		
		try {
			// 스트림 연결
			fin = new FileInputStream("src/day18/result/potato.txt");
			oin = new ObjectInputStream(fin);
			
			// 클래스 통채로 읽어온다.
			Friend potato =  (Friend) oin.readObject();
			String name = potato.getName();
			String tel = potato.getTel();
			String mail = potato.getMail();
			String addr = potato.getAddr();
			String blood = potato.getBlood();
			int age = potato.getAge();
			float height = potato.getHeight();
			char gen = potato.getGen();
			boolean rh = potato.isRh();		// 불리언은 get 아니고 is로 만든당
			
			// 출력
			System.out.println("이름 : " + name);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
			System.out.println("주소 : " + addr);
			System.out.println("혈액형 : " + blood);
			System.out.println("나이 : " + age);
			System.out.println("키 : " + height);
			System.out.println("성별 : " + gen);
			System.out.println("rh : " + (rh ? "+" : "-"));
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
