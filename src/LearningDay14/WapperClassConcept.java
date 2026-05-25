package LearningDay14;

public class WapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The process of converting primitive data type into its corresponding object and vice versa.
		//Autoboxing = automatically convert primitive data typer to Object.
		//Unboxing = automatically convert objet into primitive data type.
		
		//Autoboxing:
		int num=75;
		Integer n=num;
		System.out.println(n);
		System.out.println(n instanceof Integer);
		
		//Unboxing:
		Double pi=3.14;
		double d=pi;
		System.out.println(d);

	}

}
