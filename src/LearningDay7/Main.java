package LearningDay7;

public class Main {
	
	//Constructor concepts
	String name;
	double salary;
	int age;
	boolean status;
	float f;
	
	public Main(String companyName) {
		System.out.println(companyName);
		System.out.println(name + " "+ salary + " "+ age +" "+ status);
	}
	
	public Main() {
		name="Shahid";
		salary=117980.88;
		age=30;
		status=true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m1=new Main("TCS");
		Main m2=new Main();
		System.out.println(m2.name);
		System.out.println(m2.salary);
		System.out.println(m2.age);
		System.out.println(m2.status);
		System.out.println("Float value: "+m2.f);
	}

}
