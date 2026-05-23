package Programs;

import java.util.ArrayList;

public class WapToMoveAllZerosToRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,0,0,34,9,0,27,0,35};
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==0) {
				l1.add(arr[i]);
			}
			else {
				l2.add(arr[i]);
			}
		}
		l2.addAll(l1);
		System.out.println(l2);
	}

}
