package in.co.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student("101", "Kusum", 76);
		Student s2 = new Student("102", "Aman", 94);
		Student s3 = new Student("106", "Ajay", 75);
		Student s4 = new Student("103", "Ritik", 69);
		Student s5 = new Student("104", "Abhishek", 98);
		Student s6 = new Student("105", "Vijay", 46);

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);

		System.out.println(list);

		System.out.println("--------");

		for (Object o : list) {
			System.out.println(o);
		}

		System.out.println("--------");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
