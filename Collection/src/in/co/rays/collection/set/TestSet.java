package in.co.rays.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add(null);
		s.add(null);
		s.add('o');
		s.add('n');
		s.add('k');
		s.add('o');
		s.add('c');
		s.add(null);
		s.add('k');
		s.add('s');
		s.add('k');

		System.out.println("Set : " + s);

	}

}
