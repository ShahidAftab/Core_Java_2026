package JavaCollectionsConcept;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Every element in the linked list is known as node. It consist of 3 fields:
		 Prev -> it store the address of previous element and it is null for 1st element.
		 Next -> it store the address of next element and it is null for last element.
		 Data -> it store the actual data.
		 */

		// Create LinkedList in Java
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(45);
		l1.add(29);
		l1.add(82);
		l1.add(29);
		l1.add(76);
		l1.add(29);
		l1.add(7);
		System.out.println(l1);

		// Access LinkedList elements
		for(int i=0;i<=l1.size()-1;i++) {
			System.out.print(l1.get(i)+" ");
		}
		System.out.println();

		Iterator<Integer> ele = l1.iterator();
		while(ele.hasNext()) {
			int val = ele.next();
			if(val%2==0) {
				System.out.println(val);
			}
		}

		// Change Elements of a LinkedList
		l1.set(l1.size()-2, 72);
		System.out.println(l1);

		// Remove element from a LinkedList
		l1.remove(3);
		System.out.println(l1);

		// Checks if the LinkedList contains the element
		System.out.println(l1.contains(82));

		// Returns the index of the element
		System.out.println(l1.lastIndexOf(29));

		// Removes all the elements of the LinkedList
		l1.clear();
		if(l1.isEmpty()) {
			System.out.println("True");
		}
		System.out.println("------------------------Queue-------------------------");
		/*Java LinkedList as Queue:
		 A Queue is a linear data structure that follows the First-In-First-Out (FIFO) principle.
		 Key Operations:
		 add(E e) / offer(E e): Inserts an element at the rear (tail).
		 remove() / poll(): Removes and returns the element at the front (head).
		 element() / peek(): Retrieves, but does not remove, the front element.
		 */

		Queue<String> q1 = new LinkedList<String>();
		q1.add("Mohit");
		q1.add("Sayam");
		q1.add("Kaifee");
		q1.add("Zisheen");
		q1.add("Aquib");

		System.out.println(q1);

		// access the first element
		String firstElemet1 = q1.peek();
		System.out.println(firstElemet1);

		// access and remove the first element
		String firstElement2 = q1.poll();
		System.out.println(firstElement2);
		System.out.println(q1);

		// add element at the end
		q1.offer("Shahid");
		System.out.println(q1);

		// loop
		q1.forEach( n -> {
			System.out.println(n);
		});		

		System.out.println("-------------------Deque------------------");
		/*LinkedList as Deque:
		 A Deque can function as both a Queue (FIFO) and a Stack (LIFO).
		 Key Operations:
		 Front End: addFirst(), offerFirst(), removeFirst(), pollFirst(), getFirst(), peekFirst().
		 Rear End: addLast(), offerLast(), removeLast(), pollLast(), getLast(), peekLast().
		 */

		Deque<String> d1 = new LinkedList<String>();
		d1.add("Cow");
		d1.add("Lion");
		d1.add("Goat");
		d1.add("Rat");

		System.out.println(d1);

		// add element at the beginning
		d1.offerFirst("Tiger");
		System.out.println(d1);

		// add element at the ending
		d1.offerLast("Cat");
		System.out.println(d1);

		// remove the first element
		d1.pollFirst();
		System.out.println(d1);

		// remove the last element
		d1.pollLast();
		System.out.println(d1);
		
		// access the first element
		System.out.println(d1.peekFirst());
		
		// acces the last element
		System.out.println(d1.peekLast());

		System.out.println(d1.contains("Rat"));

	}

}
