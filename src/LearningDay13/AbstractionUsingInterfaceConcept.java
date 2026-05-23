package LearningDay13;



interface A{
	void sleep();
	void eat();
}

interface B{
	void sleep();
	void run();
}

interface C extends B{
	void work();
}

class D implements A,B,C
{

	@Override
	public void run() {
		System.out.println("I am runing.");
		
	}

	@Override
	public void sleep() {
		System.out.println("I am sleeping.");
		
	}

	@Override
	public void eat() {
		System.out.println("I am eating.");
		
	}

	@Override
	public void work() {
		System.out.println("I am working.");
		
	}
	
}
public class AbstractionUsingInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj1=new D();
		obj1.eat();
		obj1.sleep();
		obj1.run();
		obj1.work();
	}

}
