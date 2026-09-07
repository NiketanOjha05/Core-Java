package in.co.rays.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement("Naman");

		v.addElement('K');

		v.addElement(4.3);

		v.addElement(true);

		v.addElement(67);

		System.out.println("Vector : " + v);

		System.out.println("----Enumeration----");

		Enumeration e = v.elements();

		v.addElement("Raman"); // Fail Safe

		while (e.hasMoreElements()) {
			Object o = e.nextElement();

			System.out.println(o);

		}

		System.out.println("Vector : " + v);

	}

}
