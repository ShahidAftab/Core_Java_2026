package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class WapToFindTheLongestWordInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello my name is Shahid and i love doing code";
		String arr[]=str.split(" ");
		HashMap<String, Integer> m1 = new HashMap<String, Integer>();
		for(String ele:arr) {
			m1.put(ele, ele.length());
		}
		System.out.println(m1);
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for(Entry<String, Integer> ele:m1.entrySet()) {
			l1.add(ele.getValue());
		}
		System.out.println(l1);
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println(l1);
		
		m1.forEach((k,v)->{
			if(v==l1.get(0)) {
				System.out.println(k);
			}
		});
			
	}

}
