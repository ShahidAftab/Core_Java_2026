package Programs;

public class WapToCheckGivenElementIsPresentInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {36,95,4,77,59,25};
		int key = 70;
		boolean b = checkGivenElementIsPresent(key, arr);
		if(b==true) {
			System.out.println("Is Present");
		}
		else {
			System.out.println("Not Present");
		}
		
	}
	
	
	public static boolean checkGivenElementIsPresent(int key, int[] arr) {
		boolean f=false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==key) {
				f=true;
				break;
			}
		}
		if(f==true) {
			return true;
		}
		else {
			return false;
		}
	}

}
