package day02;

/**
 * 자신의 정보를 기억하고 출력하는 기능의 클래스
 * @author 전다빈
 * @since 2022.02.23
 * @version v.1.0
 *
 */
public class Test04 {
	/*
	 	자신의 이름, 나이, 이름 첫문자, 키를 변수에 기억시키고 출력하세요.
	 */
	public static void main(String[] args) {
		String name = "전다빈";
		int age = 29;
		char firstName = '전';
		double height = 162.; // JAVA의 경우 0을 생략하고 .만 찍어도 소수로 인식 .을 안찍으면 자동으로 형변환이 일어남
		
		// System.out.println("'가' > '나' : " +/* 결합연산자 */ ('가' > '나'));
		// 내용 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성 : " + firstName);
		System.out.println("신장 : " + height);
	}
}
