package LearningDay12;


class HumanBeing{
	
	String type="Male";
	
	public void sleep() {
		System.out.println("HumanBening sleep.");
	}
	
	public void displayType() {
		System.out.println(type);
	}
}

class Female extends HumanBeing{
	
	String type="Female";
	
	public void sleep() {
		System.out.println("Female sleep.");
	}
	
	public void displayType() {
		System.out.println(type);
	}
	
	public void displayHumanBeingSleepMethod() {
		super.sleep();
	}
	
}

public class PolymorphismConceptWithMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Female f1=new Female();
		f1.sleep();
		f1.displayType();
		f1.displayHumanBeingSleepMethod();

	}

}
