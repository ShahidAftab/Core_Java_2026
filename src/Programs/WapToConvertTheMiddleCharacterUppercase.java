package Programs;

public class WapToConvertTheMiddleCharacterUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Programming";
		char[] ch=str.toCharArray();
		String sent="";
		for(int i=0;i<=ch.length-1;i++) {
			if(i==(str.length()/2)) {
				sent = sent+Character.toUpperCase(ch[i]);
			}
			else {
				sent = sent+ch[i];
			}
		}
		System.out.println(sent);
	}

}
