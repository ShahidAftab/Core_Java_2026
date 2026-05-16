package Programs;

public class WapToPrintFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++) {
			int c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
