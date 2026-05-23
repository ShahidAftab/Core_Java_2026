package Programs.Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapAllPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> m1 = new HashMap<String, String>();
		// add key and value
		m1.put("UserName", "Shahid95");
		m1.put("Password", "Shahid@1234");
		
		// get value by key
		System.out.println(m1.get("Password"));
		
		// add multiple data
		m1.put("City", "Kolkata");
		m1.put("Role", "QA");
		System.out.println(m1);
		
		// update existing value
		m1.put("Role", "Senior QA");
		System.out.println(m1.get("Role"));
		
		// remove data
		m1.remove("Role");
		System.out.println(m1);
		
		
		// check key present
		System.out.println(m1.containsKey("UserName"));
		
		// check value present
		System.out.println(m1.containsValue("Kolkata"));
		
		// size of map
		System.out.println(m1.size());
		
		// print only keys
		System.out.println(m1.keySet());
		
		// print only value
		System.out.println(m1.values());
		
		// loop
		for(Entry<String, String> ele: m1.entrySet()) {
			System.out.println(ele.getKey()+" --- "+ele.getValue());
		}
		
		// check map is empty
		System.out.println(m1.isEmpty());
		
		// clear all data
		m1.clear();
		System.out.println(m1);
		
	}

}
