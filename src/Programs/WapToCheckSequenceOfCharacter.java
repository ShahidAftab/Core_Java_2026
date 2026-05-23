package Programs;

public class WapToCheckSequenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "cccddaabb";
		boolean bol=true;
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=0+i;j<=str.length()-1;j++) {
				if(str.charAt(i)>str.charAt(j)) {
					bol=false;
					break;
				}
			}
			if(bol==false) {
				break;
			}
		}
		if(bol) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
