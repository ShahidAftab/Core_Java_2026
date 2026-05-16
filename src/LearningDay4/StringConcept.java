package LearningDay4;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "D@m0"; -> String literal -> 1 object in SCP only.
		//String s = new String("A1T@b"); -> Using new keyword -> 2 objects 1 in SCP and 1 in Heap memory.
		
//		String  s="Shahid";
//		String s1="Aftab";
//		String s2="Aftab";
//		s="Kaifee";
//		
//		System.out.println(s);
//		System.out.println(s1+ " "+s2);
//		System.out.println(s1==s2);

		//String is immutable:
		String s1="Shahid"; //this object remain unchanged in SCP
		String s2="Shahid";
		String s3=s2.concat(" Ali");
		s1=s1.concat(" Aftab"); //create a new object in SCP
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// = = operator check memory location
		// equals() method check values
//		String z1="Java";
//		String z2=new String("Java");
//		String z3=new String("Java");
//		String z4="Java";
//		System.out.println(z1==z2); //false
//		System.out.println(z1==z4); //true
//		System.out.println(z2==z3); //false
//		System.out.println(z4.equals(z3)); //true
//		System.out.println(z1.equals(z2)); //true
		
		//String methods:
		String str=" ";
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		
		String x1="My Name Is Shahid Aftab And My Age Is 30";
		System.out.println(x1.replace('a', '@'));
		System.out.println(x1.replaceAll("My", "I"));
		
		boolean bol = true;
		System.out.println(String.valueOf(bol)); //convert any data type into string
		
		String y1="My Name is";
		String y2="Shahid Aftab";
		String result = String.join(" ",y1,y2); //convert in single string
		System.out.println(result);
		
		
	}

}
