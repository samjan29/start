package day14.ex;

public class Circle {
	private int radius;
	private double around, area;
	
	public Circle() {}
	public Circle(int radius) {
		this.radius = radius;
		
		setAround();
		setArea();
	}

	public void setAround() {
		around = 2 * radius * Math.PI;
	}
	
	public void setArea() {
		area = radius * radius * Math.PI;
	}
	
	@Override
	public boolean equals(Object o) {
		// 기본 데이터를 초기화 해주는 습관을 갖기
		boolean bool = false;
		
		// 받은 객체를 캐스팅해서 변수로 저장
//		Circle other = (Circle)o;
		Circle other = null;
		try {
			other = (Circle)o;
		} catch(Exception e) {
			// 형 변환이 제대로 이뤄지지 않으면
			return false;	// 함수의 반환값이 boolean이기 때문
		}
		
		// 객체 변수의 반지름을 가져와 this.radius와 주소를 비교
		bool = this.radius == other.getRadius();
		
		// 결과를 return
		return bool;
	}
	
	@Override
	public String toString() {
		return "원 - 반지름 : " + radius + ", 둘레 : " + around + ", 넓이 : " + area;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getAround() {
		return around;
	}
	public void setAround(double around) {
		this.around = around;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
}
