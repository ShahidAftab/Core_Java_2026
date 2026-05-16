package Programs;

import java.util.Arrays;

public class WapToCheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Listen";
		String s2 = "Silent";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length()) {
			char[] ch1=s1.toCharArray();
			char temp1;
			for(int i=0;i<=ch1.length-1;i++) {
				for(int j=i+1;j<=ch1.length-1;j++) {
					if(ch1[i]>ch1[j]) {
						temp1=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp1;
					}
				}
			}
			System.out.println(Arrays.toString(ch1));
			char[] ch2=s2.toCharArray();
			char temp2;
			for(int i=0;i<=ch2.length-1;i++) {
				for(int j=i+1;j<=ch2.length-1;j++) {
					if(ch2[i]>ch2[j]) {
						temp2=ch2[i];
						ch2[i]=ch2[j];
						ch2[j]=temp2;
					}
				}
			}
			System.out.println(Arrays.toString(ch2));
			boolean bool=false;
			for(int i=0;i<=ch1.length-1;i++) {
				if(ch1[i]==ch2[i]) {
					bool=true;
				}
				else {
					bool=false;
				}
			}
			if(bool) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
			
		}
		else {
			System.out.println("Not Anagram.");
		}

	}

}
