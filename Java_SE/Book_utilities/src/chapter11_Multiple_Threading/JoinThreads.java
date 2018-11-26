package chapter11_Multiple_Threading;

public class JoinThreads {

	public static void main(String[] args) {
		System.out.println("Main Thread starting.");

		MyThreadImproved myThreadImproved1 = new MyThreadImproved("Child #1");
		MyThreadImproved myThreadImproved2 = new MyThreadImproved("Child #2");
		MyThreadImproved myThreadImproved3 = new MyThreadImproved("Child #3");

		try {
			myThreadImproved1.thread.join();
			System.out.println("Child #1 joined.");

			myThreadImproved2.thread.join();
			System.out.println("Child #2 joined.");

			myThreadImproved3.thread.join();
			System.out.println("Child #3 joined.");
		
		} catch (InterruptedException exception) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread ending.");
		

	}

}
