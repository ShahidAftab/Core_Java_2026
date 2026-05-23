package Programs;

public class WapToConvertLowerCharacterToUpperAndViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My NamE iS ShAhiD";
		char ch[]=str.toCharArray();
		String sent="";
		for(int i=0;i<=ch.length-1;i++) {
			if(Character.isUpperCase(ch[i])) {
				sent = sent + Character.toLowerCase(ch[i]);
			}
			else {
				sent = sent + Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(sent);
	}

}
