package LearningDay4;

public class CharacterClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Character class is a wrapper class used to represent a single character value as an object.
		
		char ch1='k';
		System.out.println(Character.isLetter(ch1));
		char ch2='9';
		System.out.println(Character.isDigit(ch2));
		char ch3='#';
		System.out.println(Character.isAlphabetic(ch3));
		System.out.println(Character.isUpperCase(ch1));
		System.out.println(Character.toUpperCase(ch1));
		char ch4=' ';
		System.out.println(Character.isWhitespace(ch4));
		System.err.println(Character.toString(ch2));
	}

}
