package day14.ex;

public class Nemo {
	// private 변수 선언 : 가로, 세로, 넓이
	private int width, height, area;
	
	public Nemo() {}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		
		setArea();
	}
	
	public void setArea() {
		area = width * height;
	}
	
	// 가로, 세로가 각각을 비교하는 equals() 함수 오버라이드
	public boolean equals(Object o) {
		// 반환할 기본 데이터를 초기화하기
		boolean bool = false;
		
		// 매개변수로 받은 값을 형 변환해 Nemo type의 변수에 저장
		Nemo other = null;
		try {
			other = (Nemo)o;
		} catch(Exception e) {
			return false;
		}
		
		// 조건 연산자로 가로, 세로를 비교해 bool에 저장
		bool = this.width == other.getWidth() ? (this.height == other.getHeight() ? true : false) : false;
		
		
		return bool;
	}
	
	// toString() 함수를 오버라이드해서 출력값을 수정하기
	public String toString() {
		return " 사각형 - 가로 : " + width + ", 세로 : " + height + ", 넓이 : " + area;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
}
