package in.co.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparatorEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Niketan", 12000);
		Employee e2 = new Employee(2, "Karan", 75669);
		Employee e3 = new Employee(3, "Vishal", 64555);
		Employee e4 = new Employee(4, "Ronak", 60000);
		Employee e5 = new Employee(5, "Soham", 75000);

		ArrayList list = new ArrayList();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		list.forEach(System.out::println);

		Collections.sort(list);
		list.forEach(System.out::println);

		Collections.sort(list);
		list.forEach(System.out::println);

		Collections.sort(list);
		list.forEach(System.out::println);

	}

}
