package in.co.rays.abstraction;

public class TestShape {

	public static void main(String[] args) {

		Shape s1 = new Triangle();

		Triangle t1 = (Triangle) s1;

		t1.setBase(2);
		t1.setHeight(5);
		t1.area();

		System.out.println("=================");

		Shape s2 = new Circle();

		Circle c1 = (Circle) s2;

		c1.setRadius(10);
		c1.area();

	}

}