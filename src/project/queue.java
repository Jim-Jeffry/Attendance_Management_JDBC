package project;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
		//Queue<Integer> q=new PriorityQueue<Integer>();
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(16);
		q.add(45);
		q.add(3325);
		q.offer(287);//same as add method
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println(q.poll());
//		System.out.println(q.poll());
		System.out.println(q);
	}
}
