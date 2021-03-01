package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyOwnText {

	public static void main(String[] args) {
		
		String myFile = "/Users/muneeb/eclipse-workspace/Homework6/src/exceptionhandling/homework.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(myFile);
		} catch (FileNotFoundException e) {
			System.out.println("That file was not found");
		}
		
		br = new BufferedReader(fr);
		
		String note = "";
		
		try {
			while ((note = br.readLine()) != null) {
				System.out.println(note);
			}
		} catch (IOException e) {
			System.out.println("It is not safe to read this file");
		} 
			
		

	}

}
