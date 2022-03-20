package day14.ex;

public class Student {
	// 반, 이름, 국어, 영어, 수학, 총점 변수
	private int ban, kor, eng, math, total;
	private char name;
	
	public Student() {}
	public Student(int kor, int eng, int math) {
		// 이름과 반은 Student 객체의 set함수 출력해서 저장하기
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		setTotal();
	}
	
	public void setTotal() {
		total = kor + eng + math;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		
		Student stud = null;
		try {
			stud = (Student)o;
		} catch(Exception e) {
			return false;
		}
		
		// 반과 이름이 일치하는지 비교하고 bool에 참거짓 저장
		bool = ban == stud.getBan() ? (name == stud.getName() ? true : false) : false;
		
		return bool;
	}
	
	@Override
	public String toString() {
		return ban + "반의 " + name + "학생 - 국어 : " + kor + "점, 영어 : " + eng + "점, 수학 : " + math + "점 || 총점 : " + total;
	}
	
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
}
