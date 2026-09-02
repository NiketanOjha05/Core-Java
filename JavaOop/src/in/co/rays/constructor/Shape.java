package in.co.rays.constructor;

public class Shape {

	public String colour;
	public int borderWith;

	public Shape() {

		System.out.println("this is a default cons..");

	}

	public Shape(String colour) {
		this();
		this.colour = colour;

		System.out.println(this.colour);

	}

	public Shape(int borderWith, String colour) {
		this(colour);
		this.borderWith = borderWith;

		System.out.println(this.borderWith);

	}

}
