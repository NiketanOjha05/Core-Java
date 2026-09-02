package in.co.rays.encapsulation;

public class Automobile2 {

	private String color;
	private int speed;
	private String make;

	public static final int NO_OF_GEARS = 5;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void breakCar() {

		if (speed == 0) {
			System.out.println("Car stopped.");

		} else {
			speed = speed - 10;
		}

	}

	public void changeGear(int gear) {

		if (gear > 5) {
			System.out.println("Invalid gear...");
		}

		else if (gear == 1) {
			System.out.println("Gear switched 1");
			speed = speed + 20;

		}

	}

	public void accelerator() {

		if (speed == 300 || speed > 300) {
			System.out.println("Speed limit high please apply break");

		} else {
			speed = speed + 10;
		}

	}

}
