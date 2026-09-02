package in.co.rays.overriding;

public class HdfcBank extends Bank {

	@Override
	public String getName() {
		return "HDFC Bank";

	}

	@Override
	public double intrestRate() {
		return 10.24;
	}

}
