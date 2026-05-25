package LearningDay14;

public class ExceptionHandlingWithTryCatchConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {55,98,3,71,47};
		try {
			int eleValue=arr1[6];
			System.out.println(eleValue);	
		}
		catch(Exception e){
			System.out.println("The exception is: "+e);
		}
		System.out.println("Try catch 1 is completed.");

		String str=null;
		try {
			int len=str.length();
			System.out.println(len);
		}
		catch(NullPointerException e) {
			System.out.println("The exception is: "+e.getMessage());
		}
		finally {
			System.out.println("I will always run...");
		}
		System.out.println("Try catch 2 is completed.");


		int num=25;
		try {
			int result=num/0;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("The exception is: "+e);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Try catch 3 is completed.");

	}
}
