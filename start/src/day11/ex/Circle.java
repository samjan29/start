package day11.ex;

public class Circle extends Shape {
	public final double PI = 3.14;
	private int radius;
	private double area, around;
	
	public Circle() {}
	public Circle(int radius) {
		this.radius = radius;
		
		setArea();
		setAround();
	}
	
	@Override
	public void setArea() {
		area = radius * radius * PI;
	}
	
	public void setAround() {
		around = 2 * radius * PI;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("반지름이 %3d이고 넓이가 %6.2f, 둘레가 %6.2f인 원이다.", radius, area, around);
		System.out.println();
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getAround() {
		return around;
	}
	public void setAround(double around) {
		this.around = around;
	}
}
