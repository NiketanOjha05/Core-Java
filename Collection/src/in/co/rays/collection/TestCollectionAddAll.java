package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionAddAll {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add(67);
		c1.add("Kishan");
		c1.add('A');
		c1.add(4.8);
		c1.add(false);

		System.out.println("Collection 1 :" + c1);
		System.out.println("Collection 1's Size :" + c1.size());

		System.out.println("==============================");

		Collection c2 = new ArrayList();

		c2.add(43);
		c2.add("Kumar");
		c2.add('C');
		c2.add(5.6);
		c2.add(true);

		System.out.println("Collection 2 :" + c2);
		System.out.println("Collection 2's Size :" + c2.size());

		System.out.println("====================");

		c1.addAll(c2);
		System.out.println("c1 after adding c2 :" + c1);

		System.out.println(c1.removeAll(c2));
		System.out.println("c1 after removing c2 :" + c1);

	}

}
