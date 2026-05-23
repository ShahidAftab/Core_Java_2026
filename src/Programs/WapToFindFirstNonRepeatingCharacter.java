package Programs;

public class WapToFindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aabbbcabddad";
		char ch[]=str.toCharArray();
		int f[]=new int[ch.length];
		for(int i=0;i<=ch.length-1;i++) {
			f[i]=1;
			for(int j=i+1;j<=ch.length-1;j++) {
				if(ch[i]==ch[j]) {
					f[i]++;
					ch[j]='@';
				}
			}
		}
		for(int i=0;i<ch.length-1;i++) {
			if(f[i]==1) {
				System.out.println(ch[i]);
			}
		}

	}

}
