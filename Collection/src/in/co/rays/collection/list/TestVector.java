package in.co.rays.collection.list;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement("Rishabh");
		v.addElement(23);
		v.addElement(5.9);
		v.addElement("Male");

		System.out.println("Vector : " + v);

		System.out.println(v.elementAt(2));
		System.out.println(v.get(1));
	}

}
