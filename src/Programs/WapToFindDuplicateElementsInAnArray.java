package Programs;

public class WapToFindDuplicateElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {44,98,6,44,89,56,89,55,44,6,37,83,6};
		int f[]=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			f[i]=1;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					f[i]++;
					arr[j]='@';
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!='@' && f[i]>1) {
				System.out.println(arr[i]+"--------"+f[i]);
			}
		}

	}

}
