package LearningDay4;

import java.util.Scanner;

public class ScannerClassUserInputConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
//		System.out.println("Enter a sentence: ");
//		String sent = s.nextLine();
//		System.out.println("My Sentence is: "+sent);
//		
//		System.out.println("Enter a word: ");
//		String word = s.next();
//		System.out.println("My word is: "+word);
		
		System.out.println("Enter a character: ");
		char ch = s.next().charAt(0); 
		System.out.println("My character is: "+ch);
		
		System.out.println("Enter a integer: ");
		int i = s.nextInt();
		System.out.println("My integer is: "+i);
		
		System.out.println("Enter a decimal: ");
		double d = s.nextDouble();
		System.out.println("My decimal is: "+d);

	}

}
