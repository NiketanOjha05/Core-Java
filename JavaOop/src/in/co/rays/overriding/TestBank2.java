package in.co.rays.overriding;

public class TestBank2 {

	public static void main(String[] args) {

		Bank2 pnb = new PnbBank();

		System.out.println("Bank Name: " + pnb.getName());
		System.out.println("Intrest Rate: " + pnb.intrestRate());

		System.out.println("=================");

		Bank2 uno = new UnoBank();

		System.out.println("Bank Name: " + uno.getName());
		System.out.println("Intrest Rate: " + uno.intrestRate());

	}

}
