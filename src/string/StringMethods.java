package string;

public class StringMethods {
	
	public static void main(String [] args) {
		
		String a = "I will use methods from the String class to change this text";
		
		System.out.println(a.charAt(11));
		System.out.println(a.codePointAt(12));
		System.out.println(a.codePointBefore(14));
		System.out.println(a.codePointCount(11, 23));
		System.out.println(a.concat(" and more text"));
		System.out.println(a.endsWith("t"));
		System.out.println(a.equals("I Will Use Methods From The String Class To Change This Text"));
		System.out.println(a.equalsIgnoreCase("I Will Use Methods From The String Class To Change This Text"));
		System.out.println(a.hashCode());
		System.out.println(a.indexOf("S"));
		System.out.println(a.length());
		System.out.println(a.repeat(2));
	}

}
