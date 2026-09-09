package in.co.rays.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add('z');
		s.add('a');
		s.add('c');
		s.add('x');
		s.add('y');
		s.add('b');

		System.out.println("Sorted Set : " + s);

	}

}
