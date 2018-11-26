package chapter09_Exceptions;

public class UseThrowableMethods {

	public static void main(String[] args) {
		try {
			ExceptionTest.exceptionGenerator();
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Standard message is: ");
			System.out.println(exception);
			System.out.println("\nStack trace: ");
			exception.printStackTrace();
		}
		System.out.println("After catch statement.");

	}

}
