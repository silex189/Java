package chapter5;

public class StringOperations {

	public static void main(String[] args) {
		
		String string1 = "When it comes to Web programming, Java is #1.";
		String string2 = new String(string1);
		String string3 = "Java strings are powerfull.";
		
		int result, index;


		System.out.println("Length of string1: " + string1.length());

		for(int i = 0; i < string1.length(); i++)
		System.out.print(string1.charAt(i));
		System.out.println();

		if(string1.equals(string2))
			System.out.println("string1 equals string2");
		else
			System.out.println("string1 does not equal string2");


		if(string1.equals(string3))
			System.out.println("string1 equals string3");
		else
			System.out.println("string1 does not equal string3");

		result = string1.compareTo(string3);
		if(result == 0)
			System.out.println("string1 and string3 are the same size");
		else if(result < 0)
			System.out.println("String1 is shorter than string3");
		else
			System.out.println("String1 is bigger than string3");

		string2 = "One, Two, Three, One";

		index = string2.indexOf("One");
		System.out.println("Index of first occurrence of One: " + index);
		index = string2.lastIndexOf("One");
		System.out.println("Index of last occurrence of One: " + index);

		

	}

}
