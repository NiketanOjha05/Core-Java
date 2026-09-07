package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(12);
		c.add("Rakesh");
		c.add('N');
		c.add(4.2);
		c.add(true);

		System.out.println(c);
		System.out.println("Size of Collection : " + c.size());

		System.out.println("===================");

		for (Object o : c) {
			System.out.println(o);

		}

	}
}