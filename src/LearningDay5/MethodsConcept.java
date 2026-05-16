package LearningDay5;

public class MethodsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameValue = Functions.displayName();
		System.out.println(nameValue);
		Functions.multiply(20, 5);
		
		Functions f=new Functions();
		f.displayCurrentDateTime();
		f.sum(30, 10);

	}

}
