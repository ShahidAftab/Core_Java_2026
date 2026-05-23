package LearningDay9;


class Animal{
	
	String name;
	public void eat() {
		System.out.println("I am eat.");
	}
}

class Dog extends Animal{
	
	public void displayName() {
		System.out.println("My name is: "+name+".");
	}
	
	public void displaySuperClassMethod() {
		eat();
	}
	
}

public class InheritanceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.name="Jerry";
		d1.eat();
		d1.displayName();
		d1.displaySuperClassMethod();

	}

}
