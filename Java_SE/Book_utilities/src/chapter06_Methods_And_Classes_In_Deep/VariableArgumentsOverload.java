package chapter06_Methods_And_Classes_In_Deep;

public class VariableArgumentsOverload {

	static void variableArgumentsTest(int ... v) {
		System.out.println("variableArgumentTest(int ...): Number of args: " + v.length);
		System.out.println("Contents: ");

		for(int i=0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
	}

	static void variableArgumentsTest(boolean ... v) {
		System.out.println("variableArgumentTest(boolean ...): Number of args: " + v.length);
		System.out.println("Contents: ");

		for(int i=0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
	}

	static void variableArgumentsTest(String msg, int ... v) {
		System.out.println("variableArgumentTest(String, int ...): " + msg + v.length);
		System.out.println("Contents: ");

		for(int i=0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
	}
	public static void main(String[] args) {
		variableArgumentsTest(1, 2, 3);
		variableArgumentsTest("Testing: ", 10, 20);
		variableArgumentsTest(true, false, false);

	}

}
