package chapter9_Exceptions;

class NonIntResultException extends Exception {
	int numerator;
	int denominator;

	NonIntResultException(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public String toString() {
		return "Result of " + numerator + " / " + denominator + " is non-integer.";
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		int numerator[] = { 4, 8, 16, 32, 64, 127, 256, 512 };
		int denominator[] = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < numerator.length; i++) {
			try {
				if (numerator[i] % 2 != 0)
					throw new NonIntResultException(numerator[i], denominator[i]);

				System.out.println(numerator[i] + " / " + denominator[i] + " is " + numerator[i] / denominator[i]);
			} catch (ArithmeticException exception) {
				System.out.println("Can't divided by Zero.");
			} catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println("No matching element found.");
			} catch (NonIntResultException exception) {
				System.out.println(exception);
			}
		}

	}

}
