package exceptionhandling;

public class SimpleMath {
	
	public static void main(String [] args) {
		
		int number = 100;
		
		try {
			System.out.println(number/0);
		}catch(Exception x) {
			System.out.println("Not possible");
		}
		
		
	}

}
