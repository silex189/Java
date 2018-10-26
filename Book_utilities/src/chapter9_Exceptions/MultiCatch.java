package chapter9_Exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		int a = 88, b = 0;
		int result;
		char characters[] = { 'A', 'B', 'C' };

		for (int i = 0; i < 2; i++) {
			try {
				if(i == 0)
					result = a / b;
				else 
					characters[5] = 'X';
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
				System.out.println("Exception caught: " + exception);
			}
		} System.out.println("After multi-catch.");
	}

}
