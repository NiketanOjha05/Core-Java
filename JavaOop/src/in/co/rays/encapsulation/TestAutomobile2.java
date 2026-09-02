package in.co.rays.encapsulation;

public class TestAutomobile2 {

	public static void main(String[] args) {

		Automobile2 a2 = new Automobile2();

		a2.setColor("Red");
		a2.setMake("RR");
		a2.setSpeed(200);

		System.out.println("Colour : " + a2.getColor());
		System.out.println("Speed : " + a2.getSpeed());
		System.out.println("Make : " + a2.getMake());

		a2.accelerator();
		System.out.println("Speed after accelerator: " + a2.getSpeed());

		a2.changeGear(1);
		System.out.println("Current speed is: " + a2.getSpeed());

		a2.breakCar();
		System.out.println("Speed after break : " + a2.getSpeed());

	}

}
