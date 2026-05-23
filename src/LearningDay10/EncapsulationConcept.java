package LearningDay10;

public class EncapsulationConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		
		emp1.setempName("Kaifee");
		System.out.println(emp1.getempName());
		emp1.setempCity("Kolkata");
		System.out.println(emp1.getempCity());
		emp1.setempAge(30);
		System.out.println(emp1.getempAge());
		emp1.setempSalary(125000.95);
		System.out.println(emp1.getempSalary());
		emp1.setempStatus(true);
		System.out.println(emp1.getempStatus());
	}

}
