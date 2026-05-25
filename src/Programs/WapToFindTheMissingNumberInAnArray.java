package Programs;

import java.util.ArrayList;
import java.util.Collections;

public class WapToFindTheMissingNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,6,9,8};
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int ele:arr) {
			l1.add(ele);
		}
		Collections.sort(l1);
		int minVal = l1.get(0);
		int maxVal = l1.get(l1.size()-1);
		//System.out.println(minVal+" - "+maxVal);
		for(int i=minVal;i<=maxVal;i++) {
			if(!l1.contains(i)) {
				System.out.println(i+" ");
			}
		}
		
		

	}
}
