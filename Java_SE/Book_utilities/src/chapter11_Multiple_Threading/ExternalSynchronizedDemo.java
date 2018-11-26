package chapter11_Multiple_Threading;

public class ExternalSynchronizedDemo {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };

		MyThreadExternalSynchronized myThreadExternalSynchronized1 = new MyThreadExternalSynchronized("Child #1", array);
		MyThreadExternalSynchronized myThreadExternalSynchronized2 = new MyThreadExternalSynchronized("Child #2", array);

		try {
			myThreadExternalSynchronized1.thread.join();
			myThreadExternalSynchronized2.thread.join();
		} catch (InterruptedException exception) {
			System.out.println("Main thread interrupted.");
		}

	}

}
