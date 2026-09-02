package in.co.rays.overriding;

public class Rbi {

	public double getInterestRate(double principal, double interest, double time) {
		return (interest * 100) / (principal * time);
	}
}
