package Programs;

import java.util.ArrayList;

public class WapToPrintCommonElementsBwTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {3,8,5,7,9};
		int arr2[] = {8,1,7};
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for(int ele:arr1) {
			l1.add(ele);
		}
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for(int ele:arr2) {
			l2.add(ele);
		}
		
		for(int i=0;i<=l2.size()-1;i++) {
			if(l1.contains(l2.get(i))) {
				System.out.print(l2.get(i)+" ");
			}
		}

	}

}
