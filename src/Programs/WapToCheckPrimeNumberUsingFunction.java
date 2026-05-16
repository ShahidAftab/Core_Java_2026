package Programs;

public class WapToCheckPrimeNumberUsingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WapToCheckPrimeNumberUsingFunction obj = new WapToCheckPrimeNumberUsingFunction();
		obj.checkPrimeNumber(47);

	}
	
	public void checkPrimeNumber(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
		
	}
	
}
