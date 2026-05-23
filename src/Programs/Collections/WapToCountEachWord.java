package Programs.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class WapToCountEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "here is cat and cat is an animal lovely cat";
		String[] s1=str.split(" ");

		ArrayList<String> l1=new ArrayList<String>(Arrays.asList(s1));
		HashMap<String, Integer> m1 = new HashMap<String, Integer>();

		HashSet<String> t1 = new HashSet<String>(l1);
		t1.forEach( n ->{
			m1.put(n, Collections.frequency(l1, n));
		});
		//System.out.println(m1);

		ArrayList<Integer> l2=new ArrayList<Integer>();
		m1.forEach((k,v) -> {
			l2.add(v);
		});

		Collections.sort(l2, Collections.reverseOrder());
		//System.out.println(l2);

		m1.forEach((k,v) ->{
			//System.out.println(k+ "---"+ v);
			if(v==l2.get(0)) {
				System.out.println(v+""+k);
			}
		});
		
		l2.forEach( n ->{
			m1.forEach((k,v) ->{
				//System.out.println(k+ "---"+ v);
				if(v==n) {
					System.out.println(n+""+k);
				}
			});
		});
		
	}
}
