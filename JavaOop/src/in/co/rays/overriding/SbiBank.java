package in.co.rays.overriding;

public class SbiBank extends Bank {

	@Override
	public String getName() {
		return "SBI Bank";

	}

	@Override
	public double intrestRate() {
		return 12;
	}

}
