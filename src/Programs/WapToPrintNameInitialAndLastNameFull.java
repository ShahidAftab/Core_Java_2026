package Programs;

public class WapToPrintNameInitialAndLastNameFull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Shahid Ali Hussain Khan";
		String s1[]=str.split(" ");
		String ch="";
		for(int i=0;i<=s1.length-2;i++) {
			String word=s1[i];
			ch = ch+word.charAt(0)+".";
		}
		System.out.println(ch+s1[s1.length-1]);
	}

}
