package in.co.rays.abstraction;

public class TestBank {

	public static void main(String[] args) {

		Bank b1 = new PnbBank();

		PnbBank p1 = (PnbBank) b1;

		System.out.println(p1.getName());
		System.out.println(p1.intrestRate());

	}

}
