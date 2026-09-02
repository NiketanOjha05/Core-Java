package in.co.rays.abstraction;

public class Triangle extends Shape {

	private int base;
	private int height;

	@Override
	public void area() {
		System.out.println("area of triangle: " + (base * height));

	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
