package LearningDay8;

public class ThisKeywordConcept { // is used to refer current class object. Note: can't used inside static method.
	
	int age;
	String name;
	
	public ThisKeywordConcept() {
		this(30, "Shahid"); // to call current class constructor
		System.out.println("This is Constructor1.");
	}
	
	public ThisKeywordConcept(int age, String name) {
		this.age=age; // refer to current class instance variable
		this.name=name;
		System.out.println("This is Constructor2.");
	}
	
	public void displayDetails() {
		System.out.println(name+" - "+age);
	}
	
	public void invokeDisplay() {
		this.displayDetails(); // to call current class method and variable.
		System.out.println("This invoked value: "+this.name+" - "+this.age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordConcept obj = new ThisKeywordConcept();
		obj.invokeDisplay();
	}

}
