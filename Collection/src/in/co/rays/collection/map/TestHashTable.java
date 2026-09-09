package in.co.rays.collection.map;

import java.util.Hashtable;

public class TestHashTable {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();

		h.put(1, "Kaushal");
		h.put(2, "Raman");
		h.put(3, "Rishabh");
		h.put(4, "Harshit");
		h.put("Five", "Udit");
		h.put("Six", "Paras");
		h.put("Roshan", 654356);

		System.out.println(h);

		System.out.println(h.get(3));
		System.out.println(h.containsKey("six"));
		System.out.println(h.containsKey("Five"));
		System.out.println(h.containsValue(654356));
		System.out.println(h.containsValue(5));

		System.out.println("------------");

		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.entrySet());

		System.out.println("----------------");

		h.remove("Five");
		System.out.println(h);
		h.clear();
		System.out.println(h);

	}

}
