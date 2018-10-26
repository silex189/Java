package chapter9_Exceptions;
// exception in another class
class ExceptionTest {
	static void exceptionGenerator() {
		int nums[] = new int[4];

		System.out.println("Before the expection is generated.");
		nums[7] = 10;
		System.out.println("this won't be displayed.");
	}
}

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try {
			ExceptionTest.exceptionGenerator();
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Index out-of-bounds.");
		}

		System.out.println("After catch statement.");
	}

}
