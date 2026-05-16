package LearningDay7;

public class Student {
	
	// Constructor chaining within same class using this() keyword.
	public int id;
	public String name;
	
	public Student() {
		this(121, "Mohit");
		System.out.println("I am a constructor without parameters.");
	}
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
		System.out.println("I am a constructor with parameters: "+id+" --- "+name);
	}
	
	public void display() {
		System.out.println("Id: "+id+"   "+"Name: "+name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.display();

	}

}
