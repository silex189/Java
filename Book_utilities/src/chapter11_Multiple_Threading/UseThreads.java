package chapter11_Multiple_Threading;

public class UseThreads {

	public static void main(String[] args) {
		System.out.println("Main thread starting.");

		MyThread myThread = new MyThread("Child #1");

		Thread newThread = new Thread(myThread);

		newThread.start();

		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exception) {
				System.out.println("Main thread interrupted.");
			}
		}
		System.out.println("Main thread ending.");
	}

}
