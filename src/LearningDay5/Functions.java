package LearningDay5;

import java.time.LocalDateTime;

public class Functions {

	public void sum(int n1, int n2) {
		int sum = n1+n2;
		System.out.println(sum);
	}
	
	public void displayCurrentDateTime() {
		System.out.println(LocalDateTime.now());
	}
	
	public static void multiply(int n1, int n2) {
		System.out.println(n1*n2);
	}
	
	public static String displayName() {
		String name="Shahid Aftab";
		return name;
	}
	
}
