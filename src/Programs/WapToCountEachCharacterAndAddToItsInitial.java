package Programs;

public class WapToCountEachCharacterAndAddToItsInitial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "ABBCCCDDDD";
		String result = countEachCharacter(str);
		System.out.println(result);
	}


	public static String countEachCharacter(String str) {
		String sent="";
		char ch[]=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			int count=1;
			for(int j=i+1;j<=ch.length-1;j++){
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='@';
				}
			}
			if(ch[i]!='@') {
				sent=sent+count+ch[i];
			}
		}
		return sent;
	}
}
