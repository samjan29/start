package day18;

import java.io.*;

/*
 	감자튀김의 정보를 Friend 클래스를 이용해서 저장해보자.
 	
 	ObjectOutputStream 을 이용해서 저장
 */
public class Test06 {

	public Test06() {
		// 기본 스트림
		FileOutputStream fout = null;
		// 보조 스트림
		ObjectOutputStream oout = null;
		
		// 데이터 만들고
		Friend fried = new Friend();
		fried.setName("감자튀김");
		fried.setTel("010-9999-9999");
		fried.setMail("pota@totototo.toto");
		fried.setAddr("Pota, To, po");
		fried.setBlood("PT");
		fried.setAge(99);
		fried.setHeight(205.7F);
		fried.setGen('T');
		fried.setRh(false);
		
		try {
			// 스트림 연결
			fout = new FileOutputStream("src/day18/result/potato.txt");
			// 필터 스트림 연결
			oout = new ObjectOutputStream(fout);
			
			// 준비된 데이터를 쓴다.
			oout.writeObject(fried);
			
			// 이처럼 클래스 전체를 입출력하는 행위를 직렬화라고 표현한다.
			System.out.println("+++++ 직렬화 성공 +++++");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
