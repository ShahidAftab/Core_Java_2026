package LearningDay12;

public class PolymorphismConceptWithMethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displaySum(5, 7);
		PolymorphismConceptWithMethodOverLoading p1=new PolymorphismConceptWithMethodOverLoading();
		double sum = p1.displaySum(9.5, 7.5);
		System.out.println(sum);
	}
	
	public static void displaySum(int n1, int n2) {
		int sum=n1+n2;
		System.out.println(sum);
	}
	
	public double displaySum(double d1, double d2) {
		return d1+d2;
	}

}
