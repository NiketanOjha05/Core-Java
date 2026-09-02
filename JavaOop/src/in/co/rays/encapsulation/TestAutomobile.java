package in.co.rays.encapsulation;

public class TestAutomobile {

	public static void main(String[] args) {

		Automobile a1 = new Automobile();

		a1.setColour("red");
		a1.setSpeed(200);
		a1.setMake("BMW");

		System.out.println("Colour : " + a1.getColour());
		System.out.println("Speed : " + a1.getSpeed());
		System.out.println("Make : " + a1.getMake());
	}

}
