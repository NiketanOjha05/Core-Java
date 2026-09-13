package in.co.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparableStudent {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student("101", "Kusum", 76));
		list.add(new Student("102", "Aman", 94));
		list.add(new Student("106", "Ajay", 75));
		list.add(new Student("103", "Ritik", 69));
		list.add(new Student("104", "Abhishek", 98));
		list.add(new Student("105", "Vijay", 46));

		list.forEach(System.out::println);

		System.out.println("=============================");

		Collections.sort(list);

		list.forEach(System.out::println);

	}

}
