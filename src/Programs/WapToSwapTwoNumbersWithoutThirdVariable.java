package Programs;

public class WapToSwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=35; int n2=27;
		
//		n1 = n1+n2;
//		n2 = n1-n2;
//		n1 = n1-n2;
//		
//		System.out.println(n1+"----"+n2);
		
		//Using third variable
		
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println(n1+"---------"+n2);
		
		

	}

}
