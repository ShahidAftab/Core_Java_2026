package LearningDay8;


class OfficePrinter{
	
	private OfficePrinter() {
		
	}
	
	private static OfficePrinter obj = new OfficePrinter();
	
	public static OfficePrinter getInstance() {
		return obj;
	}
	
	public void printDocument(String docName) {
		System.out.println("Printing: "+docName);
	}
}

public class SingletonClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OfficePrinter obj1=new OfficePrinter(); // error
		OfficePrinter emp1Printer = OfficePrinter.getInstance();
		emp1Printer.printDocument("GST001");
		
		OfficePrinter emp2Printer = OfficePrinter.getInstance();
		emp2Printer.printDocument("TaxInvoice0212");

	}

}
