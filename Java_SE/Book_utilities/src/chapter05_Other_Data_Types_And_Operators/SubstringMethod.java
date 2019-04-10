package chapter05_Other_Data_Types_And_Operators;

public class SubstringMethod {
	public static void main(String[] args) {
		String originalString = "Java makes the Web move.";

		String subString = originalString.substring(5, 18);

		System.out.println("originalString: " + originalString);
		System.out.println("subString: " + subString);

	}
}
