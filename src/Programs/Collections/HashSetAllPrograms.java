package Programs.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetAllPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> s1 = new HashSet<String>();
		// add element to set
		s1.add("Java");
		s1.add("JS");
		s1.add("Java");
		s1.add("Python");
		
		// print set
		System.out.println(s1);
		
		// size of set
		System.out.println(s1.size());
		
		// check element exists
		System.out.println(s1.contains("JS"));
		
		// remove an element
		s1.remove("JS");
		System.out.println(s1);
		
		// loop 
		for(String ele:s1) {
			System.out.println(ele);
		}
		
		// using iterator
		Iterator<String> it = s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		// check set is empty
		System.out.println(s1.isEmpty());
		
		// clear all element
		s1.clear();
		System.out.println(s1);
		
		// convert Array list to Hash set
		ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        
        HashSet<Integer> s2 = new HashSet<Integer>(list);
        System.out.println(s2);
        
        HashSet<Integer> s3 = new HashSet<>();
        s3.add(20);
        s3.add(40);
        
        // find common element b/w to set
        s2.retainAll(s3);
        System.out.println(s2);
		
	}

}
