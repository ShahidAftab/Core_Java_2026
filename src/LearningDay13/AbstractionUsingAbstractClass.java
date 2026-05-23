package LearningDay13;

abstract class Car{
	
	public Car() {
		System.out.println("I am Car class Constructor.");
	}
	
	abstract void start();
	abstract void stop();
	
	public void displayCarName() {
		System.out.println("BMW");
	}
	
	public static void displayCarModel() {
		System.out.println("BMWV - Model001");
	}
}

class Car1 extends Car{
	
	public Car1() {
		super();
		System.out.println("I am Car1 constructor.");
	}
	
	public void start() {
		System.out.println("Car started.");
	}
	
	public void stop() {
		System.out.println("Car stoped.");
	}
	
	public void changeGear() {
		System.out.println("Gear changed.");
	}
}

public class AbstractionUsingAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1=new Car1(); //Upcasting
		c1.start();
		c1.stop();
		c1.displayCarName();
		c1.displayCarModel();
		System.out.println("--------------------------------------");
		Car1 c2 = new Car1();
		c2.changeGear();
		c2.displayCarName();
		
		

	}

}
