package Programs;

public class WapToReverseEachWordWithoutChangingPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Happy Mother day 2026";
		String s1[]=str.split(" ");
		String sent="";
		for(String ele:s1) {
			String word=ele;
			String rev="";
			for(int i=0;i<=word.length()-1;i++) {
				rev=word.charAt(i)+rev;
			}
			sent = sent+rev+" ";
		}
		System.out.println(sent);
	}

}
