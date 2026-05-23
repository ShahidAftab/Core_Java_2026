package LearningDay9;

public class ClassAndObjectConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungMobile mobile1=new SamsungMobile(); // creating object1
		SamsungMobile mobile2=new SamsungMobile(); // creating object2
		mobile1.sModelNo="S26";
		mobile1.launchYear=2025;
		mobile1.displayDetails();
	}

}

class SamsungMobile{ // Define the class
	
	String sModelNo;  // Attributes
	int launchYear;
	
	public void displayDetails() { // methods
		System.out.println(sModelNo+" - "+launchYear);
	}
	
}