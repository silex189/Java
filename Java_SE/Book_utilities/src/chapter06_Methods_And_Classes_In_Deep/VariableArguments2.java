package chapter06_Methods_And_Classes_In_Deep;

public class VariableArguments2 {

	static void variableArgumentsTest(String msg, int ... v) {
		System.out.println(msg + v.length);
		System.out.println("Contents: ");

		for(int i=0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);

			System.out.println();
	}
	public static void main(String[] args) {
		variableArgumentsTest("One variable arguments: ", 10);
		variableArgumentsTest("Three variable arguments: ", 1, 2, 3);
		variableArgumentsTest("No variable arguments");

	}

}
