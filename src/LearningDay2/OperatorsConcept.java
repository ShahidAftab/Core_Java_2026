package LearningDay2;

public class OperatorsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pre and Post inc/dre(++a,a++,--a,a--):
//		int i = 3;
//		System.out.println(++i);
//		
//		int x = 5;
//		System.out.println(x++);
//		
//		int a = 100;
//		System.out.println(--a);
		
//		int i = 2;
//		int a = i-- + ++i + 2 + ++i + i++ + i-- + i++ + i++ + i + ++i;
//		//      2 + 2 + 2 + 3 + 3 + 4 + 3 + 4 + 5 + 6
//		System.out.println(a);
//		System.out.println(i);
		
		int i = 3;
		int a = --i + ++i + i++ + i++ + i + --i + i-- + i + i++;
		System.out.println(i);
		System.out.println(a);
		
		int num = 456;
		System.out.println(num%10);// will give the last digit.
		System.out.println(num=num/10);// will remove the last digit
		
		//Ternary operator:
		int n1 = 5;
		int n2 = 7;
		int res = (n1>n2)?n1:n2;
		System.out.println(res);
		
		int n3 = 27;
		String result = (n3%2==0)?"Even":"Odd";
		System.out.println(result);
		
		
		

	}

}
