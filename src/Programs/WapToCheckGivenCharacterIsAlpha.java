package Programs;

public class WapToCheckGivenCharacterIsAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='@';
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			System.out.println("Is Alpha");
		}
		else {
			System.out.println("Not Alpha");
		}

	}

}
