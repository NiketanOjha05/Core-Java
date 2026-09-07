package in.co.rays.collection.list;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {

		Stack s = new Stack();

		for (char c = 'a'; c <= 'z'; c++) {
			s.push(c);

		}

		System.out.println("Stack : " + s);
		System.out.println(s.peek());
		System.out.println("Stack : " + s);
		System.out.println(s.pop());
		System.out.println("Stack : " + s);
	}

}
