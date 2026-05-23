package JavaCollectionsConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s1 = new HashSet<Integer>();
		HashSet<String> s2 = new HashSet<String>();
		
		s1.add(44);
		s1.add(75);
		s1.add(44);
		s1.add(9);
		s1.add(38);
		s1.add(null);
		s1.add(25);
		s1.add(null);
		
		System.out.println(s1);
		
		System.out.println(s1.contains(9));

		s1.remove(null);
		System.out.println(s1);
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s1.size());
		
		Iterator<Integer> it = s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
