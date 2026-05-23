package LearningDay9;


class Person{
	String name;
	int age;
	String type="Human Being";
	
	public void work() {
		System.out.println("Person work daily.");
	}
	
	public void displayPersonDetails() {
		System.out.println(name+" -> "+age);
	}
}

class Emp extends Person{
	String type="Part of Person";
	
	public void work() {
		System.out.println("Employee work daily.");
	}
	
	public void displayType() {
		System.out.println(type);
	}
	
	public void displayPersonWorkMethodAndType() {
		super.work();
		System.out.println(super.type);
	}
	
}

public class InheritanceMethodOverridingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp();
		e1.name="Shahid";
		e1.age=30;
		System.out.println(e1.type);
		e1.displayPersonDetails();
		e1.displayType();
		e1.work(); // overriding
		e1.displayPersonWorkMethodAndType();
	}

}
