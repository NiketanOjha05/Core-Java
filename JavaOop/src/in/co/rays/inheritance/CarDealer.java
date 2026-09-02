package in.co.rays.inheritance;

public class CarDealer extends Businessman {

	private String brand;
	private int totalCars;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getTotalCars() {
		return totalCars;
	}

	public void setTotalCars(int totalCars) {
		this.totalCars = totalCars;
	}
}
