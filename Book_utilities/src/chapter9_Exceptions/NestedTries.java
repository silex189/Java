package chapter9_Exceptions;
// try inside try
public class NestedTries {

	public static void main(String[] args) {
		int numerator[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denominator[] = { 2, 0, 4, 4, 0, 8 };
		try {
			for (int i = 0; i < numerator.length; i++) {
				try {
					System.out.println(numerator[i] + " / " + denominator[i] + " is " + numerator[i] / denominator[i]);
				} catch (ArithmeticException exception) {
					System.out.println("Can't divided by Zero.");
				}
			}
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("No matching element found.");
			System.out.println("Fatal error -- program terminated.");
		}

	}

}
