package LearningDay8;

public class SuperKeywordConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp();
		e1.display();
		e1.callingParentDetails();

	}

}

class Person{
	int noOfFingers=10;
	
	public Person(int id) {
		System.out.println("Person: "+id);
	}
	
	public void display() {
		System.out.println("I am person.");
	}
	
}

class Emp extends Person{
	
	int noOfFingers=11;
	
	public Emp() {
		super(0101); // to  access super class constructor
	}
	
	public void display() {
		System.out.println("I am employee.");
	}
	
	public void callingParentDetails() {
		super.display(); //call super class method
		System.out.println(super.noOfFingers); // call super class variable
	}
}

