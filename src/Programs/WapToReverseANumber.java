package Programs;

public class WapToReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=432;
		int rev=0;
		while(num>0) {
			int ld=num%10;
			rev=rev*10+ld;
			num=num/10;
		}
		System.out.println(rev);
	}

}
