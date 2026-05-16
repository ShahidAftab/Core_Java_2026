package Programs;

public class WapToFindTheMissingNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,6,9,8};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int maxVal = arr[arr.length-1];
		for(int i=1;i<=maxVal;i++) {
			boolean f = false;
			for(int j=0;j<=arr.length-1;j++) {
				if(arr[j]==i) {
					f=true;
					break;
				}
			}
			if(f==false) {
				System.out.println(i);
			}
		}

	}
}
