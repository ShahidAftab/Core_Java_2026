package Programs.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListAllPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> l1=new ArrayList<Object>();
		// Add element to array list
		l1.add(55);
		l1.add("Shahid");
		l1.add("Mindfire");
		l1.add(99.99);
		l1.add(true);
		l1.add(null);
		l1.add("Shahid");
		
		// Print all element using loop
		for(Object ele:l1) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		// Find the size of an array list
		System.out.println(l1.size());
		
		// Get element by index
		for(int i=0;i<=l1.size()-1;i++) {
			System.out.print(l1.get(i)+" ");
		}
		System.out.println();
		
		// Update element
		l1.set(2, "Google");
		System.out.println(l1);
		
		// remove element
		l1.remove(5);
		System.out.println(l1);
		
		// check element exists
		boolean bol = l1.contains("Google");
		System.out.println(bol);
		
		ArrayList<Integer> l2=new ArrayList<Integer>();
		// Add element to array list
		l2.add(55);
		l2.add(8);
		l2.add(17);
		l2.add(0);
		l2.add(87);
		l2.add(45);
		l2.add(8);
		l2.add(29);
		l2.add(0);
		
		// sort array list
		Collections.sort(l2);
		System.out.println(l2);
		
		// reverse  array list
		Collections.reverse(l2);
		System.out.println(l2);
		
		// shuffle array list
		Collections.shuffle(l2);
		System.out.println(l2);
		
		// Max number
		int max = Collections.max(l2);
		System.out.println(max);
		
		// Min number
		int min = Collections.min(l2);
		System.out.println(min);
		
		// sum and avg of element
		int sum=0;
		for(Integer ele:l2) {
			sum = sum+ele;
		}
		int avg = sum/l2.size();
		System.out.println(sum);
		System.out.println(avg);
		
		for(Integer ele:l2) {
			if(ele%2==0) {
				System.out.print(ele+" ");
			}
		}
		System.out.println();
		
		// remove duplicate element
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		
		for(Integer ele:l2) {
			if(!l3.contains(ele)) {
				l3.add(ele);
			}
		}
		System.out.println(l3);
		
		// Copy one array list to another
		ArrayList<Object> l4=new ArrayList<Object>(l1);
		System.out.println(l4);
		
		// Merge two array list
		l2.addAll(l3);
		System.out.println(l2);
		
		// clear all elements
		l3.clear();
		System.out.println(l3);
		
		// check array list is empty
		System.out.println(l3.isEmpty());
		
		// Frequency of element
		l1.forEach( n -> {
			System.out.print(Collections.frequency(l1, n)+"-"+n+" ");
		});
		System.out.println();
		
		// convert array list to array
		Object arr[] = l1.toArray();
		System.out.println(arr.length);
		
		// iterate using Iterator
		Iterator<Object> it = l1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		// find sub list from array list
		ArrayList<Object> l5 = new ArrayList<Object>();
		l5.addAll(l1.subList(2, 5));
		System.out.println(l5);
		
		// convert array to array list
		String[] str = {"xyz", "bac", "ggg", "raw", "ozq"};
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList(str));
		System.out.println(l6);
		
		// search an element
		Collections.sort(l6);
		System.out.println(Collections.binarySearch(l6, "ggg")); // return index if present
		
		
	}

}
