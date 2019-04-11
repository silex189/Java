package chapter09_Exceptions;

class UseFinally {
	public static void ExceptionGenerator(int what) {
		int t;
		int nums[] = new int[2];

		System.out.println("Receiving " + what);
		try {
			switch (what) {
			case 0:
				t = 10;
				break;
			case 1:
				nums[4] = 4;
				break;
			case 2:
				return;
			}
		} catch (ArithmeticException exception) {
			System.out.println("Can't divided by Zero!");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("No matching element found.");
		} finally {
			System.out.println("Leaving try.");
		}
	}
}

public class FinallyDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			UseFinally.ExceptionGenerator(i);
			System.out.println();
		}

	}

}
