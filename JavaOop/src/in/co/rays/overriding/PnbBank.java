package in.co.rays.overriding;

public class PnbBank extends Bank2 {

	@Override
	public String getName() {
		return "PNB Bank";
	}

	@Override
	public double intrestRate() {
		return 9.02;
	}

}
