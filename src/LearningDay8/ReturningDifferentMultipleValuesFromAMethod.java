package LearningDay8;

public class ReturningDifferentMultipleValuesFromAMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] arr = displayDetails();
		for(Object ele:arr) {
			System.out.println(ele);
		}
	}

	public static Object[] displayDetails() {
		int age=30;
		String name="Shahid";
		double sal=678324.59;
		
		Object[] arr= {age,name,sal};
		
		return arr;
	}
	
}
