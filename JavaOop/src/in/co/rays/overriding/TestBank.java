package in.co.rays.overriding;

public class TestBank {

	public static void main(String[] args) {

		Bank b1 = new AxisBank();

		System.out.println(b1.getName());
		System.out.println(b1.intrestRate());
		System.out.println("-----------");

		Bank b2 = new HdfcBank();

		System.out.println(b2.getName());
		System.out.println(b2.intrestRate());
		System.out.println("----------------");

		Bank b3 = new SbiBank();

		System.out.println(b3.getName());
		System.out.println(b3.intrestRate());

	}

}
