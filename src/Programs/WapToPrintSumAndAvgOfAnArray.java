package Programs;

public class WapToPrintSumAndAvgOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,9,45,77,1,32};
		int sum=0;
		for(int ele:arr) {
			sum=sum+ele;
		}
		System.out.println("Sum of element in an Array is: "+sum);
		double avg=(double)sum/arr.length;
		System.out.println("Avg of an Array is: "+avg);
	}
}
