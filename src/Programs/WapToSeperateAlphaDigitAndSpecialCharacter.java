package Programs;

public class WapToSeperateAlphaDigitAndSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="M7 N@m8 !s Sh@h!d";
		char[] ch=str.toCharArray();
		String myAlpha="";
		String myDigit="";
		String mySplChar="";
		for(int i=0;i<=ch.length-1;i++) {
			if(Character.isLetter(ch[i])) {
				myAlpha=myAlpha+ch[i];
			}
			else if(Character.isDigit(ch[i])) {
				myDigit=myDigit+ch[i];
			}
			else {
				if(ch[i]!=' ')
				mySplChar=mySplChar+ch[i];
			}
		}
		System.out.println(myAlpha);
		System.out.println(myDigit);
		System.out.println(mySplChar);
	}

}
