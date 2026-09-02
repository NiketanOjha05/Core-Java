package in.co.rays.overriding;

public class TestRbi {

	public static void main(String[] args) {

		Punjab pnb = new Punjab();
		Kotak k = new Kotak();
		Central c = new Central();

		double principal = 10000;
		double interest = 1000;
		double time = 2;

		System.out.println("PNB Interest Rate: " + pnb.getInterestRate(principal, interest, time));

		System.out.println("Kotak Interest Rate: " + k.getInterestRate(principal, interest, time));

		System.out.println("Central Interest Rate: " + c.getInterestRate(principal, interest, time));

	}

}
