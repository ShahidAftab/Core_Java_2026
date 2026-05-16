package Programs;

public class WapToCheckArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1634;
		int n1=num;
		int n2=num;
		int count=0;
		while(n1>0) {
			n1=n1/10;
			count++;
		}
		int sum=0;
		while(n2>0){
			int ld=n2%10;
			double p = Math.pow(ld, count);
			sum=sum+(int)p;
			n2=n2/10;
		}
		if(num==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}

	}

}
