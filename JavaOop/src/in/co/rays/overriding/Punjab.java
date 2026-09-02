package in.co.rays.overriding;

public class Punjab extends Rbi {

	@Override
	public double getInterestRate(double principal, double interest, double time) {
		return ((interest * 100) / (principal * time)) + 2;
	}
}
