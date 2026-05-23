package Programs.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class WapToCountEachWordAndPrintInDescOrder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "here is cat and cat is an animal lovely cat";
		String[] s1=str.split(" ");
		
		ArrayList<String> l1=new ArrayList<String>(Arrays.asList(s1));
		System.out.println(l1);
		
		TreeSet<String> t1 = new TreeSet<String>(l1);
		t1.forEach( n ->{
			System.out.println(Collections.frequency(l1, n)+" "+n);
		});

	}

}
