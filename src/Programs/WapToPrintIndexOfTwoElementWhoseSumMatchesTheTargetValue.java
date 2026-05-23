package Programs;

public class WapToPrintIndexOfTwoElementWhoseSumMatchesTheTargetValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,9,3,1,5};
		int targetValue=10;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]+arr[j]==targetValue) {
					System.out.println(i+"-"+j);
					break;
				}
			}
		}
	}

}
