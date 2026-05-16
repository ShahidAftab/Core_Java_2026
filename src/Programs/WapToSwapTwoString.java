package Programs;

public class WapToSwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hi";
		String s2="One";
		
		String s3=s1.concat(s2); //HiOne
		s1=s3.substring(s1.length());
		System.out.println(s1);
		s2=s3.substring(0,s1.length()-1);
		System.out.println(s2);
				
	}

}
