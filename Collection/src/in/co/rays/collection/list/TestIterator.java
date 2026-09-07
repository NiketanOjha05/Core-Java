package in.co.rays.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(0, "Rakesh");
		list.add(1, 'R');
		list.add(2, 2.4);
		list.add(3, false);
		list.add(4, 56);

		System.out.println("list :" + list);

		System.out.println("----for loop----");

		for (Object o : list) {
			System.out.println(o);

		}

		System.out.println("----Iterator----");

		Iterator it = list.iterator();

		while (it.hasNext()) {

			Object o = it.next();

			System.out.println("Elements :" + o);

			// it.remove();

		}
		System.out.println("list : " + list);

	}

}
