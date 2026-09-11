package in.co.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {

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
