package LearningDay2;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check a given number is even or odd
		
		int num = -78;
		if(num>0) {
			if(num%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}
		else {
			System.out.println("Invalid number.");
		}

	}

}
