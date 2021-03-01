package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyOwnText2 {

	public static void main(String[] args) {
		
		String b = "/Users/muneeb/eclipse-workspace/Homework6/src/exceptionhandling/homework2";
		
		FileReader fr = null;
		
		BufferedReader br = null;
		
		try {
			fr = new FileReader(b);
		} catch (FileNotFoundException e) {
			System.out.println("This is not a valid file");
		}
		
		br = new BufferedReader(fr);
		
		String myText = "";
		
		try {
			while((myText = br.readLine()) != null) {
				System.out.println(myText);
			}
		} catch (IOException e) {
			System.out.println("Do not try to read this file");
		}
		
		finally {
			try {
				if(fr != null) {
				fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(br != null) {
					br.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
			
		
			
		
	

		
