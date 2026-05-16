package LearningDay6;

public class StaticBlockConcept {

	static String  name;
	
	static {
		name="block";
		System.out.println("This is static "+name+".");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main method.");

	}

}
