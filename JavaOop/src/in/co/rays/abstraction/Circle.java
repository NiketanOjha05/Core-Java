package in.co.rays.abstraction;

public class Circle extends Shape {

	private int radius;

	@Override
	public void area() {
		System.out.println("area of circle :" + (Math.PI * radius * radius));

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
