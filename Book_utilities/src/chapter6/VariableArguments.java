package chapter6;

public class VariableArguments {

	static void variableArgumentsTest(int ... v) {
		System.out.println("Number of args: " + v.length);
		System.out.println("Contents: ");

		for(int i=0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);

		System.out.println();
	}

	public static void main(String[] args) {
		variableArgumentsTest(10);
		variableArgumentsTest(1, 2, 3);
		variableArgumentsTest();
	}

}
