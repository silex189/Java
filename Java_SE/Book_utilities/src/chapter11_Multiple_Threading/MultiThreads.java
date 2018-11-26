package chapter11_Multiple_Threading;

public class MultiThreads {

	public static void main(String[] args) {
		System.out.println("Main thread starting");

		MyThreadImproved myThreadImproved1 = new MyThreadImproved("Child #1");
		MyThreadImproved myThreadImproved2 = new MyThreadImproved("Child #2");
		MyThreadImproved myThreadImproved3 = new MyThreadImproved("Child #3");
		
		do {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exception) {
				System.out.println("Main thread interrupted.");
			}
		} while (myThreadImproved1.thread.isAlive() ||
						myThreadImproved2.thread.isAlive() ||
						myThreadImproved3.thread.isAlive());

		System.out.println("Main thread ending.");
	}

}
