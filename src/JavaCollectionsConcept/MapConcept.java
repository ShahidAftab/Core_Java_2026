package JavaCollectionsConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapConcept {
	
	public static void main(String args[]) {
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		HashMap<String, String> m2 = new HashMap<String, String>();
		
		m1.put(1005, "Mohit");
		m1.put(1001, "Ram");
		m1.put(1004, "Kaif");
		m1.put(1007, "Shahid");
		m1.put(1001, "Kundan");
		m1.put(1008, "Kaif");
		
		System.out.println(m1);
		
		System.out.println(m1.get(1004));
		m1.remove(1004);
		System.out.println(m1);
		System.out.println(m1.size());
		
//		m1.clear();
//		System.out.println(m1);
		
		for(Entry<Integer, String> ele:m1.entrySet()) {
			System.out.println(ele.getKey()+  "  "+ele.getValue());
		}
		
		System.out.println(m1.containsKey(1005));
		
		System.out.println(m1.containsValue("Kundan"));
		
		m1.replace(1001, "Faizan");
		System.out.println(m1);
		
		m1.forEach((k,v) ->{
			System.out.println(k+" --- "+v);
		});
		
		System.out.println(m1.isEmpty());
		
		
		
		
	}

}
