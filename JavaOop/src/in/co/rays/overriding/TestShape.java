package in.co.rays.overriding;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle();

		c.setColor("red");
		c.setBorderWidth(4);
		c.setRadius(4);

		System.out.println("colour : " + c.getColor());
		System.out.println("border width : " + c.getBorderWidth());
		System.out.println("circle radius : " + c.getRadius());

	}
}
