package Programs;

public class WapToPrintEachDigitWithFollowingUnitPlaceValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=57936; // O/p->50000, 7000, 900, 30 ,6
		String val = String.valueOf(num);
		for(int i=0;i<=val.length()-1;i++) {
			System.out.print(val.charAt(i));
			for(int j=i+1;j<=val.length()-1;j++) {
				System.out.print("0");
			}
			System.out.print(" ");
		}
	}

}
