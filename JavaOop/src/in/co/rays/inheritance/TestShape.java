package in.co.rays.inheritance;

public class TestShape {
	public static void main(String[] args) {

		Circle c = new Circle();

		c.setRadius(45);
		c.setBoderWidth(89);
		c.setColour("red");

		System.out.println("BoderWidth : " + c.getBoderWidth());
		System.out.println("Radius : " + c.getRadius());
		System.out.println("Colour : " + c.getColour());

		System.out.println("-------------------------");

		Traingle t = new Traingle();

		t.setBoderWidth(2);
		t.setBase(10);
		t.setHigth(5);
		t.setColour("black");

		System.out.println("Base : " + t.getBase());
		System.out.println("Hight : " + t.getHigth());
		System.out.println("BoderWidth : " + t.getBoderWidth());
		System.out.println("Colour : " + t.getColour());

		System.out.println("-------------------------");

		Rectengle r = new Rectengle();

		r.setBoderWidth(3);
		r.setLength(5);
		r.setWidth(2);
		r.setColour("yellow");

		System.out.println("Lenght : " + r.getLength());
		System.out.println("Width : " + r.getWidth());
		System.out.println("BoderWidth : " + r.getBoderWidth());
		System.out.println("Colour : " + r.getColour());

	}

}