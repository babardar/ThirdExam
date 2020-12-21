package exam3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ques15 {

	public static void main(String[] args) {
		// 15.Write a program to add the element and remove the element on both the side?
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ali");
		deque.addFirst("Babar");
		deque.add("Umair");
		deque.add("Rohan");
		System.out.println("Printing deque: "+ deque);
		deque.addFirst("Java");
		deque.addLast("Adeel");
		System.out.println(" ");
		System.out.println("Adding first and last element: " + deque);
		deque.removeFirst();
		deque.removeLast();
		System.out.println(" ");
		System.out.println("After removing the element on both side: " + deque);
	}

}
