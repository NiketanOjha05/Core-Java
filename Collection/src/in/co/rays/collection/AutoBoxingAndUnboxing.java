package in.co.rays.collection;

public class AutoBoxingAndUnboxing {

	public static void main(String[] args) {

		int i = 10;

		Integer i5 = 1; // AutoBoxing

		int a = 15; // AutoUnBoxing

		System.out.println("------------------Old Version----------------------");

		int s = 5;

		Integer n = new Integer(s); // AutoBoxing

		int k = n; // UnBoxing

		System.out.println("==========");

		System.out.println(Integer.max(55, 52));

		System.out.println("============");

		String str = "50";

		int c = Integer.parseInt(str);
		System.out.println(c);

		System.out.println("===========");

		String s1 = String.valueOf(c);
		System.out.println(s1);

	}

}
