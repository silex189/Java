package chapter09_Exceptions;

public class QueueExceptionDemo {

	public static void main(String[] args) {
		FixedQueue fixedQueue = new FixedQueue(10);
		char ch;
		int i;

		try {
			for(i = 0; i < 11; i++) {
				System.out.print("Attempting to store: " + (char) ('A' + i));
				fixedQueue.put((char) ('A' + i));
				System.out.println(" --- OK");
			}
			System.out.println();
		} catch (QueueFullException exception) {
			System.out.println(exception);
		} 
		System.out.println();

		try {
			for (i = 0; i < 11; i++) {
				System.out.print("Getting next char: ");
				ch = fixedQueue.get();
				System.out.println(ch);
			}
		} catch (QueueEmptyException exception) {
			System.out.println(exception);
		}
	}
}


