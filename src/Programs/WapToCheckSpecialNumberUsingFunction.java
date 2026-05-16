package Programs;

public class WapToCheckSpecialNumberUsingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(checkSpecialNumber(145)) {
			System.out.println("Special number");
		}
		else {
			System.out.println("Not Special number");
		}

	}

	public static boolean checkSpecialNumber(int num) {
		int n=num;
		int sum=0;
		while(n>0) {
			int ld=n%10;
			n=n/10;
			int fact=1;
			for(int i=1;i<=ld;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}

	}

}
