package LearningDay14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* throw -> is used to manually create and send an exception.
 1. Used inside method/block using new keyword
 2. Can't throw multiple exception.
*/
/* throws -> is used to declare an exception that may occur in a method.
 1. Used with method signature
 2. can declare multiple exception
 */

public class ExceptionHandlingWithThrowsAndThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int availableBalance = 5000;
//		int withdrawAmount = 7000;
//		
//		if(withdrawAmount>availableBalance) {
//			throw new ArithmeticException("Insufficient balance."); // throw
//		}
//		System.out.println("Transaction Successful.");
//		
		try {
			readFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void readFile() throws FileNotFoundException, IOException {
		FileReader f = new FileReader("myFile.txt");
		BufferedReader br = new BufferedReader(f);
		System.out.println(br.readLine());
	}
	
}

