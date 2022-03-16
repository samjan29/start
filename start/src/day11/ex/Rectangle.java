package day11.ex;

public class Rectangle extends Shape {
	private int width, height, area;
	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		
		setArea();
	}
	
	@Override
	public void setArea() {
		area = width * height;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("가로가 %3d 이고, 세로가 %3d 이고, 넓이가 %3d 인 사각형", width, height, area);
		System.out.println();
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
