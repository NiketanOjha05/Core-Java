package in.co.rays.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		System.out.println("---ArrayList----");

		List list = new ArrayList();

//		ArrayList list1 = new ArrayList();

		list.add(0, "Karan");
		list.add(1, 'K');
		list.add(2, 5.3);
		list.add(3, false);
		list.add(4, 63);
		list.add(5, "Karan");

		System.out.println("list : " + list);
		System.out.println(list.get(5));

		System.out.println(list.remove(5));
		System.out.println("list : " + list);

		System.out.println(list.set(0, "Samar"));
		System.out.println(list);

		System.out.println(list.indexOf(63));
		System.out.println(list.lastIndexOf("Samar"));
		System.out.println(list.subList(0, 4));

		System.out.println("----Linked List----");

		LinkedList list1 = new LinkedList();

		list1.add("Aman");
		list1.add(22);
		list1.add("Male");
		list1.add(true);
		list1.add(5.7);

		System.out.println("List : " + list1);

	}

}
