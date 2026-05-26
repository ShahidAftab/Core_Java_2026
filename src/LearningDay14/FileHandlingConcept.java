package LearningDay14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingConcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Create a file:
//		System.out.println(System.getProperty("user.dir"));
//		File f=new File(System.getProperty("user.dir")+"\\src\\LearningDay14\\MyFile.txt");
//		if(f.createNewFile()) {
//			System.out.println("File created is "+f.getName());
//		}
//		else {
//			System.out.println("File creation error.");
//		}
		
		//Writing text to file:
//		FileWriter fw = new FileWriter(System.getProperty("user.dir")+"\\src\\LearningDay14\\MyFile.txt");
//		fw.write("Hi, I have created the file even added some text. Thank you.");
//		fw.close();
		
		//Read a file:
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\LearningDay14\\MyFile.txt");
		BufferedReader b = new BufferedReader(fr);
		String str = b.readLine();
		while(str!=null) {
			System.out.println(str);
			break;
		}
		b.close();
		
		//Delete a file:
		File f=new File(System.getProperty("user.dir")+"\\src\\LearningDay14\\MyFile.txt");
		if(f.delete()) {
			System.out.println(f.getName()+" is deleted.");
		}
		else{
			System.out.println("Error.");
		}
		
		
		
	}

}
