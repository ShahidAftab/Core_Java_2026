package LearningDay6;

public class VariableScope {
	
	static double piValue=3.14; // static/class variable
	
	int age=30; // instance variable
	
	void displayInfo() {
		int n1=5;  //local variable
		String name="Shahid";
		System.out.println(name+"---"+n1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableScope v1=new VariableScope();
		v1.displayInfo();
		System.out.println(piValue);
		System.out.println(v1.age);

	}

}
