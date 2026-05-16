package LearningDay6;

public class Employee {
	
	int empId;
	String empName;
	static String empCompany="TCS";
	double empSalary;
	
	public static void changeCompanyName() {
		empCompany="Mindfire Digital LLP";
	}
	
	public Employee(int id, String name, double salary) {
		empId=id;
		empName=name;
		empSalary=salary;
	}
	
	public void displayEmpDetails() {
		System.out.println(empId+" "+empName+" "+empCompany+" "+empSalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		changeCompanyName();
		Employee emp1=new Employee(333, "Ram", 89567.89);
		Employee emp2=new Employee(777, "Mohit", 750038.99);
		emp2.displayEmpDetails();
		emp1.displayEmpDetails();

	}

}
