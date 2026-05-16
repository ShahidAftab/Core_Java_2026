package Programs;

public class WapToPrintSumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=852;
		int sum=0;
		while(num>0) {
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
