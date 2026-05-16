package LearningDay7;

public class Employee extends Person {
	//Constructor chaining from different class using super() keyword
	public Employee() {
		super("Shahid", 30);
		System.out.println("Child class constructor called.");
	}

}
