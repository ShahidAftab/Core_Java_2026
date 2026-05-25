package LearningDay9;

public class FinalKeywordConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
//	final double pi=3.14;
//	
//	public void changePiValue() {
//		pi=7.14; //checked exception -> compile time error
//		System.out.println(pi);
//	}

}

class Vehicle{
	
	final int noOfWheels = 6;
	
	public final void displayVehicleDetails() {
		System.out.println("I am Vehicle0001.");
	}
	
}
class Car extends Vehicle{
	int noOfWheel = 4;
	
//	public void displayVehicleDetails() { // error can't override method automatically inherited.
//		System.out.println("I am VehicleCar0001.");
//	}
	
}

final class A{
	int age=30;
	
	public void displayDetails() {
		System.out.println("I am person.");
	}
}

//class B extends A{ // error can't be extended as A class is final
//	
//}

// constructor can't be final.
