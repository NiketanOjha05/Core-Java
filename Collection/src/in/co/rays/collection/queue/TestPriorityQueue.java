package in.co.rays.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {

		Queue q = new PriorityQueue();

		q.add("Niketan");
		q.add(5);

		System.out.println(q); //ClassCastxception

	}

}
