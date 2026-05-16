package Programs;

public class WapToPrintAllThePrimeNumberBWGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=11; int n2=35;
		for(int i=n1;i<=n2;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}

	}

}
