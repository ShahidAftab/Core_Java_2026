package LearningDay3;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {32,45,98,6,81,66};
		System.out.println(arr1.length);
		System.out.println(arr1[4]);
		System.out.println(arr1[arr1.length-1]);
		
		String arr2[] = new String[4];
		arr2[0]="Cat";
		arr2[1]="Rat";
		arr2[2]="Tiger";
		arr2[3]="Dog";
		for(int i=0;i<=arr2.length-1;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for(int ele:arr1) { //for each loop
			System.out.print(ele+" ");
		}
		
	}

}
