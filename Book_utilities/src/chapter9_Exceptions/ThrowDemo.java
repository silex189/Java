package chapter9_Exceptions;

public class ThrowDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Before Throw.");
			throw new ArithmeticException();
		} catch (ArithmeticException exception) {
			System.out.println("Exception caught.");
		}
		System.out.println("After try/catch block.");

	}

}
