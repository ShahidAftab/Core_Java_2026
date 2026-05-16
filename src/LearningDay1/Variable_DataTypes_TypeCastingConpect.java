package LearningDay1;

public class Variable_DataTypes_TypeCastingConpect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable:
		double decVal = 58.98;
		int $integerVal = 30;
		String _name = "Shahid";
		
		//DataTypes:
		//1. primitive data type:
		//byte-short-char-int-long-float-double-boolean
		//2. non-primitive data type:
		//String, Array, Object, List, Map...
		
		//TypeCasting:
		//1. Widening(Implicit type casting) - Automatically
		//2. Narrowing(Explicit type casting) - Manually
		
		short s = 25;
		long s1 = s; // implicit type casting
		System.out.println(s1);
		
		double d = 854.99;
		int d1 = (int)d; // explicit type casting
		System.out.println(d1);
		
		long l = 122;
		char l1 = (char)l;
		System.out.println(l1);
		
		double dd = 65.55;
		char dd1 = (char)dd;
		System.out.println(dd1);
		
		char c = 'c';
		int c1 = c;
		System.out.println(c1);
		

	}

}
