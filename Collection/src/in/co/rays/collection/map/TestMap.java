package in.co.rays.collection.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map m = new HashMap();

		m.put(1, "Karan");
		m.put(2, "Shivam");
		m.put(3, "Aman");
		m.put("Four", null);
		m.put("Raman", 34523);
		m.put("Karan", 78654);
		m.put("Five", 1);

		System.out.println(m);

		System.out.println(m.values());
		System.out.println(m.keySet());
		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue(1));
		System.out.println(m.entrySet());

		System.out.println("------------");

		m.remove("Five");
		System.out.println(m);
		m.clear();
		System.out.println(m);

	}

}
