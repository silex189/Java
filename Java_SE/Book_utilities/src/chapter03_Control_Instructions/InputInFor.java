package chapter03_Control_Instructions;

public class InputInFor {
	public static void main(String[] args) throws java.io.IOException {

				int i;

				System.out.println("Press S to stop.");

				for(i = 0; (char) System.in.read() != 's'; i++)
						System.out.println("Attempt #" + i);
	}
}
