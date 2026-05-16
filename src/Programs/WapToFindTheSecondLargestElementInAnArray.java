package Programs;

import java.util.Arrays;

public class WapToFindTheSecondLargestElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {33,45,12,7,32,19};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-2]);
	}

}
