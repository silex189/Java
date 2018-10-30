package chapter11_Multiple_Threading;

public class SynchronizedDemo {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };

		MyThreadSynchronized myThreadSynchronized1 = new MyThreadSynchronized("Child #1", array);
		MyThreadSynchronized myThreadSynchronized2 = new MyThreadSynchronized("Child #2", array);

		try {
			myThreadSynchronized1.thread.join();
			myThreadSynchronized2.thread.join();
		} catch (InterruptedException exception) {
			System.out.println("Main thread interrupted.");
		}

	}

}
