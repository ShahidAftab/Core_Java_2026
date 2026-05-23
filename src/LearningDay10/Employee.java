package LearningDay10;

public class Employee {
	
	private String empName;
	private String empCity;
	private int empAge=29;
	private double empSalary;
	private boolean empStatus;
	
	public String getempName() {
		return empName;
	}
	
	public String getempCity() {
		return empCity;
	}
	
	public int getempAge() {
		return empAge;
	}
	
	public double getempSalary() {
		return empSalary;
	}
	
	public boolean getempStatus() {
		return empStatus;
	}
	
	public void setempName(String empName) {
		this.empName=empName;
	}

	public void setempCity(String empCity) {
		this.empCity=empCity;
	}
	
	public void setempAge(int empAge) {
		this.empAge=empAge;
	}
	
	public void setempSalary(double empSalary) {
		this.empSalary=empSalary;
	}
	
	public void setempStatus(boolean empStatus) {
		this.empStatus=empStatus;
	}

	
}
