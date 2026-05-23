package Programs;

import java.util.ArrayList;

public class WapToComapreAdjacentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="658488";
		ArrayList<Character> l1 = new ArrayList<Character>();
		char ch[]=str.toCharArray();
		for(int i=0;i<=ch.length-2;i++) {
			if(ch[i]>ch[i+1]) {
				l1.add('>');
			}
			else if(ch[i]<ch[i+1]) {
				l1.add('<');
			}
			else {
				l1.add('=');
			}
		}
		System.out.println(l1);
	}

}
