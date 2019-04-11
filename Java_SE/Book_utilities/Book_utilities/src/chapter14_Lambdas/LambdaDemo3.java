package chapter14_Lambdas;

interface StringTest {
	boolean test(String string1, String string2);
}

public class LambdaDemo3 {

	public static void main(String[] args) {
		StringTest isIn = (string1, string2) -> string1.indexOf(string2) != -1;
		
		String string = "This is a test";
		System.out.println("Testing string: " + string);
		
		if (isIn.test(string,  "is a"))
			System.out.println("'is a' found");
		else
			System.out.println("'is a' not found.");
		
		if (isIn.test(string, "xyz"))
			System.out.println("'xyz' found");
		else
			System.out.println("'xyz' not found");

	}

}
