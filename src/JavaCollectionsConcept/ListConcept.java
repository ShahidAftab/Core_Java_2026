package JavaCollectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l1 = new ArrayList<String>();
		ArrayList <Object> l2 = new ArrayList<Object>();
		
		l1.add("Car"); // add elements to list
		l1.add("Tiger");
		l1.add(null);
		l1.add("BMW");
		l1.add(null);
		l1.add("Tiger");
		
		l2.add(87);
		l2.add(99.11);
		l2.add("Hello");
		l2.add(null);
		l2.add(false);
		
		System.out.println(l1+" --------- "+l2);
		
		l1.add(2, "Apple"); // add element to specified index
		System.out.println(l1);
		
		ArrayList<String> l3 = new ArrayList<String>();
		l3.add("Java");
		l3.add("JS");
		l3.add("Python");
		
		l3.addAll(l1); // add element from one list to another
		System.out.println(l3);
		
		l1.addAll(3, l3); // add items at a specified position in the list
		System.out.println(l1);
		
		l2.clear(); // remove all the elements
		System.out.println(l2);
		
		System.out.println(l3.contains("JS")); // Check if an item exists in a list
		System.out.println(l1.contains("Lion")); 
		
		l3.forEach((ele) -> { // use lambda expression to print each element
			System.out.println(ele);
		});
		
		System.out.println(l1.get(2)); // return element at specified position
		
		System.out.println(l3.indexOf("Py")); // returns the position of the first occurrence of a value in the list. 
		// If the item is not found in the list then it returns -1.
		
		System.out.println(l3.indexOf("Tiger")); // returns the position of the last occurrence of a value in the list. 
		// If the item is not found in the list then it returns -1.
		
		System.out.println(l2.isEmpty()); // Check if a list is empty
		
		l3.remove("Python"); // remove specified element
		l3.remove(1);
		System.out.println(l3);
		
		l1.removeAll(l1); // remove all elements
		System.out.println(l1);
		
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		l4.add(4);
		l4.add(9);
		l4.add(5);
		l4.add(10);
		l4.add(5);
		l4.add(84);
		
		l4.removeIf( ele -> ele%2 != 0); // removes all elements from this list for which a condition is satisfied
		System.out.println(l4);
		
		l4.replaceAll(ele -> ele+1); // replaces every item in a list with the result of performing an operation on the item
		System.out.println(l4); 
		
		l4.set(2, 3); // Replace an item in a list
		System.out.println(l4);
		
		l4.add(45);
		
		System.out.println(l4.size()); // return how many elements are there in list
		
		System.out.println(l4.subList(1, 3)); // Get a sublist from a list
		
		Iterator<Integer> it = l4.iterator(); // returns an Iterator for the list
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		Object[] arr = l4.toArray(); // convert in Object array
		for(Object i:arr) {
			System.out.println(i);
		}
		

	}

}
