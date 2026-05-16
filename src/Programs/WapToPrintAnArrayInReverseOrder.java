package Programs;

public class WapToPrintAnArrayInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"Dog","Lion","Cat","Tiger","Ant"};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
