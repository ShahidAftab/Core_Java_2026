package LearningDay6;

public class Student {
	
	int sRoll;
	String sName;
	static String sSchoolName="Xaviers";
	boolean sStatus;
	
	public Student(int roll, String name, boolean bol) {
		sRoll=roll;
		sName=name;
		sStatus=bol;
	}
	
	public Student(int roll, boolean bol) {
		sRoll=roll;
		sStatus=bol;
	}


	public void displayStidentDetails() {
		System.out.println(sRoll+" "+sName+" "+sSchoolName+" "+sStatus);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(3,"Rahul",true);
		Student s2=new Student(7, "Ankita", false);
		Student s3=new Student(2, false);
		s1.displayStidentDetails();
		s2.displayStidentDetails();
		s3.displayStidentDetails();

	}

}
